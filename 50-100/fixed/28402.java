public void actionPerformed(java.awt.event.ActionEvent arg0) {
    java.lang.String userBarcode = javax.swing.JOptionPane.showInputDialog("To whoom do you which to register the bike?:");
    if ((userBarcode != null) && ((database.getUser(userBarcode)) != null)) {
        try {
            database.addBicycle(userBarcode);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}