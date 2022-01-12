public void initialize() {
    targetPileChoice.setItems(javafx.collections.FXCollections.observableArrayList("1", "2", "3"));
    targetPileChoice.setValue("1");
    nim = new stateandbehavior.Nim();
    update();
}