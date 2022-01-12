protected void initComponents() {
    address.util.LoggerManager.updateWithConfig(config);
    modelManager = new address.model.ModelManager();
    storageManager = new address.storage.StorageManager(modelManager, address.prefs.PrefsManager.getInstance().getPrefs());
    mainController = new address.controller.MainController(this, modelManager, config);
    syncManager = new address.sync.SyncManager(config);
    keyBindingsManager = new address.keybindings.KeyBindingsManager();
    updateManager = new address.updater.UpdateManager();
    alertMissingDependencies();
}