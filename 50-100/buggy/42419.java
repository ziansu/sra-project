@javafx.fxml.FXML
void deleteImageCommand(javafx.event.Event event) {
    javafx.scene.image.ImageView iv = noteImagesList.getSelectionModel().getSelectedItem();
    javafx.collections.ObservableList<javafx.scene.image.ImageView> imageList = noteImagesList.getItems();
    imageList.remove(iv);
    noteImagesList.setItems(imageList);
    selectedNote.removeImage(getImageModel(iv).getImageUrl());
    imageModelList.remove(iv);
    register(callBack);
}