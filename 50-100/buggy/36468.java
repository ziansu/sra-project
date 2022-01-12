private void configure(java.lang.String appTitle, java.lang.String appName, seedu.commando.model.UserPrefs prefs, seedu.commando.logic.Logic logic) {
    this.logic = logic;
    this.appName = appName;
    this.userPrefs = prefs;
    setTitle(appTitle);
    setIcon(Config.ApplicationIcon);
    setWindowDefaultSize(prefs);
    scene = new javafx.scene.Scene(rootLayout);
    setDraggable(titleBar);
    setKeyboardShortcuts();
    setTabAndArrowKeysNavigations();
    primaryStage.setScene(scene);
    helpWindow = seedu.commando.ui.HelpWindow.load(primaryStage, Config.UserGuideUrl);
}