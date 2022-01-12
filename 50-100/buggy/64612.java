public void findUserByBarcode(java.lang.String barcode) {
    Garage.Bicycle bicycle = manager.getBicycle(barcode);
    Garage.User user = bicycle.getOwner();
    if (user == null)
        javax.swing.JOptionPane.showMessageDialog(null, "No user found");
    else {
        users.setSelectedValue(user, true);
        updateBicyclesModel(user);
        bicycles.setSelectedValue(bicycle, true);
        this.selectedUser = user;
        this.selectedBicycle = bicycle;
    }
}