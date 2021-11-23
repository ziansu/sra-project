private void handleOnClose(javafx.stage.WindowEvent event) {
    if (scriptingProject.isChanged()) {
        event.consume();
        initSaveModal();
    }
}