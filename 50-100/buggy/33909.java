public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        controller.ClientController.createConnection();
        controller.ClientController.sendUsernameAndGetOnlineClients();
        getPanel().setVisible(true);
        getBtnPoveziSe().setVisible(false);
        getBtnPrekiniVezu().setVisible(true);
        getBtnOsvezi().setVisible(true);
        controller.ClientController.startServerResponseThread();
    } catch (java.lang.Exception e1) {
        javax.swing.JOptionPane.showMessageDialog(null, e1.getMessage(), "Greska", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}