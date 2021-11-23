protected void switchWindow() {
    window.getChildren().clear();
    if (!(isMainWindow)) {
        window.getChildren().add(pane);
    }else {
        window.getChildren().add(logObject);
    }
    window.getChildren().add(gui.GUIController.bottomBar);
    isMainWindow = !(isMainWindow);
}