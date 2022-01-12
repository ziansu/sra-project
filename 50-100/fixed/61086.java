@javafx.fxml.FXML
public void save(javafx.event.ActionEvent event) {
    try {
        util.Vehicle vehicle = new util.Vehicle(makeTF, modelTF, yearTF, colorTF, typeCB, priceTF);
        util.Vehicle.insertEntry(vehicle);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}