public static seedu.address.controller.MainWindow load(javafx.stage.Stage primaryStage, seedu.address.util.Config config, seedu.address.model.UserPrefs prefs, seedu.address.controller.Ui ui, seedu.address.model.ModelManager modelManager, seedu.address.browser.BrowserManager browserManager) {
    seedu.address.controller.MainWindow mainWindow = seedu.address.controller.UiPartLoader.loadUiPart(primaryStage, new seedu.address.controller.MainWindow());
    mainWindow.configure(config.getAppTitle(), config.getAddressBookName(), config, prefs, ui, modelManager, browserManager);
    return mainWindow;
}