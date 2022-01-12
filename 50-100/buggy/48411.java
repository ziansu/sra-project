protected void switchWindow() {
    window.getChildren().clear();
    if (!(isMainWindow)) {
        window.getChildren().add(pane);
        pane.requestFocus();
    }else {
        window.getChildren().add(logObject);
        logObject.requestFocus();
    }
    window.getChildren().add(gui.GUIController.bottomBar);
    isMainWindow = !(isMainWindow);
}