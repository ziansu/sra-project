public guitests.guihandles.HelpWindowHandle openHelpWindowUsingMenu() {
    clickOn(new java.lang.String[]{ "Help" , "F1" });
    return new guitests.guihandles.HelpWindowHandle(guiRobot, primaryStage);
}