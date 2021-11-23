@javafx.fxml.FXML
public void initialize() {
    initControllers();
    cleanCompletedTasks();
    cleanEmptyCategories();
    loadListsInTabs();
    initTutorialPopup();
    selectionModel = bodyController.tPaneMain.getSelectionModel();
    application.Execution.executeStatusCheckTimerTask();
}