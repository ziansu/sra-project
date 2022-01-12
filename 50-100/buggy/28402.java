public void actionPerformed(java.awt.event.ActionEvent arg0) {
    java.lang.String userBarcode = javax.swing.JOptionPane.showInputDialog("To whoom do you which to register the bike?:");
    if (userBarcode != null) {
        BicycleGarage.User user = database.getUser(userBarcode);
        if (user != null) {
            java.lang.String barcode = Utils.BarcodeGenerator.getCode();
            BicycleGarage.Bicycle bicycle = new BicycleGarage.Bicycle(barcode);
            user.addBicycle(bicycle);
            try {
                database.addBicycle(userBarcode);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
    }
}