public void findUserByBarcode(java.lang.String barcode) {
    Garage.Bicycle bicycle = manager.getBicycle(barcode);
    if (bicycle == null)
        javax.swing.JOptionPane.showMessageDialog(null, "No user found");
    else {
        Garage.User user = bicycle.getOwner();
        users.setSelectedValue(user, true);
        updateBicyclesModel(user);
        bicycles.setSelectedValue(bicycle, true);
        this.selectedUser = user;
        this.selectedBicycle = bicycle;
    }
}