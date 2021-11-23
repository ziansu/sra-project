@java.lang.Override
public void onTimelineSaved() {
    javafx.stage.FileChooser chooseFile = new javafx.stage.FileChooser();
    javafx.stage.FileChooser.ExtensionFilter extFilter = new javafx.stage.FileChooser.ExtensionFilter("XML files (*.xml)", "*.xml");
    chooseFile.getExtensionFilters().add(extFilter);
    java.io.File file = chooseFile.showSaveDialog(appView.getRoot().getScene().getWindow());
    try {
        fileHandler.saveTimeline(app.getCurrentTimeline(), file);
    } catch (java.lang.Exception saver) {
    }
}