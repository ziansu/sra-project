public void handle(javafx.stage.WindowEvent we) {
    updateDatabaseWithUIModel(controller.getItems());
    saveAndClearLoadedDatabase();
}