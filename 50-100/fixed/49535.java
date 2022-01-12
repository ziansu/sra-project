private void chooseChat() {
    java.lang.System.out.println("Choose chat");
    javax.swing.DefaultListModel listModel = new javax.swing.DefaultListModel();
    listModel = client.getListModel();
    java.util.ArrayList<java.lang.String> online = client.getOnline();
    for (int i = 0; i < (online.size()); i++) {
        onlineTextPane.setText((((onlineTextPane.getText()) + (online.get(i))) + "\n"));
    }
}