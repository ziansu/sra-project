private java.lang.Boolean checkNewProjectHeadquarterTextFields() {
    try {
        java.lang.String buildingName = ProjectAddCreateHeadquarter_BuildingNameTextfield.getText();
        if (buildingName.isEmpty()) {
            return false;
        }else {
            return true;
        }
    } catch (java.lang.NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Wrong value numbers");
    }
    return false;
}