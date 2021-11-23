@javafx.fxml.FXML
public void level1Pressed() {
    populateObservableList(1);
    buttonClicked(Button1);
    java.lang.String outputText = _statistics.printStatistics(1);
}