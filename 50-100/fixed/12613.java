@java.lang.Override
public void start(javafx.stage.Stage primaryStage) {
    setupComponents();
    mainController.start(primaryStage);
    address.events.EventManager.getInstance().post(new address.events.LoadDataRequestEvent(address.prefs.PrefsManager.getInstance().getSaveLocation()));
    syncManager.startSyncingData(config.updateInterval, config.simulateUnreliableNetwork);
}