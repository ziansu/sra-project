public guitests.guihandles.HelpWindowHandle openHelpWindowUsingMenu() {
    clickOn("Help", "F1");
    return new guitests.guihandles.HelpWindowHandle(guiRobot, primaryStage);
}