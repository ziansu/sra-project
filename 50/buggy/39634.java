@javafx.fxml.FXML
void initialize() {
    comboBoxDatabaseType.setButtonCell(comboCellFactoryCallback().call(null));
    comboBoxDatabaseType.setCellFactory(comboCellFactoryCallback());
}