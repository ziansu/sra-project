private void getSaveProperties(javafx.scene.control.Button startButton) {
    ch.ice.view.GUIController.path = ch.ice.view.GUIController.config.getString("writer.file.path");
    ch.ice.view.GUIController.chosenPath = ch.ice.view.GUIController.config.getString("writer.file.chosenPath");
    if ((ch.ice.controller.MainController.uploadedFileContainingCustomers) == null) {
        startButton.setDisable(true);
    }else
        startButton.setDisable(false);
    
}