@javafx.fxml.FXML
public void showExercise() throws java.io.IOException, javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXException {
    selection.exercise = new trainer.models.Exercise(selection.catalog, exercisesListView.getSelectionModel().getSelectedItem().toString());
    exerciseTextArea.setText(selection.exercise.description);
    trainer.App.getInstance().controllers.put("trainer", trainer.gui.TrainerController.createWithName("trainer"));
}