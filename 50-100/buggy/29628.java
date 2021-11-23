@javafx.fxml.FXML
void deleteUrlCommand(javafx.event.Event event) {
    javafx.scene.control.Hyperlink hl = noteUrlList.getSelectionModel().getSelectedItem();
    javafx.collections.ObservableList<javafx.scene.control.Hyperlink> linkList = noteUrlList.getItems();
    linkList.remove(hl);
    noteUrlList.setItems(linkList);
    selectedNote.removeUrl(hl.getText());
    register(callBack);
}