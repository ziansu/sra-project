protected void sendToServer(java.lang.String request) {
    java.lang.System.out.println("SendToServer");
    try {
        App.client.sendToServer(request);
    } catch (java.io.IOException e) {
        javax.swing.JOptionPane.showMessageDialog(null, "Error: Server comunication problem", "Commuinication Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}