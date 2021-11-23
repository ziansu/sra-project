@javafx.fxml.FXML
public void save(javafx.event.ActionEvent event) {
    try {
        util.Vehicle vehicle = new util.Vehicle(makeTF, modelTF, yearTF, colorTF, typeCB, priceTF, usedCB);
        util.Vehicle.insertEntry(vehicle);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    } finally {
        alphaController.getSearchVehicleTabController().updateResultSet();
        alphaController.getSearchVehicleTabController().displayResultSet();
    }
}