private void handleOnClose(javafx.stage.WindowEvent event) {
    if ((scriptingProject) != null) {
        if (scriptingProject.isChanged()) {
            event.consume();
            initSaveModal();
        }
    }
}