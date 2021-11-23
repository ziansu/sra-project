@java.lang.Override
public void init() throws java.lang.Exception {
    seedu.task.MainApp.logger.info("=============================[ Initializing MESS ]===========================");
    super.init();
    config = initConfig(getApplicationParameter("config"));
    storage = new seedu.task.storage.StorageManager(config);
    userPrefs = initPrefs(config);
    initLogging(config);
    model = initModelManager(storage, userPrefs);
    logic = new seedu.task.logic.LogicManager(model, storage);
    ui = new seedu.task.ui.UiManager(logic, config, userPrefs);
    initEventsCenter();
}