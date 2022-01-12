@javafx.fxml.FXML
void inputManualKeywordFive(javafx.event.ActionEvent event) {
    if ((listKeywordFour.getValue()) != null) {
        listKeywordFive.setValue(helper.ManualWindowHelper.inputManualKeyword(listKeywordFive, null, 5, listKeywordFour.getValue().getId(), changeKeywordFive, save));
        setPathToDestination(5);
    }
}