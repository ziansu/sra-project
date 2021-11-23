@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    if (((Path) != null) && ((IP) != null)) {
        try {
            client = new controller.Client(this, IP.getText(), Path.getText());
            client.setPriority(java.lang.Thread.MAX_PRIORITY);
            client.start();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }else
        javax.swing.JOptionPane.showMessageDialog(null, "Enter IP and Path");
    
}