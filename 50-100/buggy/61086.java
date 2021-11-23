@javafx.fxml.FXML
public void save(javafx.event.ActionEvent event) {
    try {
        util.Vehicle vehicle = new util.Vehicle(makeTF, modelTF, yearTF, colorTF, typeCB, priceTF);
        vehicle.insertEntry();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}