@javafx.fxml.FXML
void saveButtonClicked() {
    java.lang.System.out.println("Save button clicked!");
    if ((track) == null) {
        track = new Track(0, "", 0, "");
    }
    track.trackName = trackNameTextField.getText();
    Genre selectedGenre = ((Genre) (genreChoiceBox.getSelectionModel().getSelectedItem()));
    track.genreId = selectedGenre.genreID;
    track.save();
    parent.initialize();
    stage.close();
}