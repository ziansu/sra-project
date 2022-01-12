@javafx.fxml.FXML
void inputManualKeywordFive(javafx.event.ActionEvent event) {
    if ((listKeywordFive.getValue()) != null) {
        listKeywordFive.setValue(helper.ManualWindowHelper.inputManualKeyword(listKeywordFive, null, 5, listKeywordFour.getValue().getId(), changeKeywordFive, save));
        if ((listKeywordFive.getValue().toString().length()) > 0) {
            setPathToDestination(5);
        }
    }
}