public static void initialize(no.steria.skuldsku.recorder.SkuldskuConfig config) {
    if ((no.steria.skuldsku.recorder.Skuldsku.config) != null) {
        no.steria.skuldsku.recorder.logging.RecorderLog.error("You are initializing Skuldsku twice, ignoring second attempt at initalizing.", new java.lang.Throwable());
    }else {
        no.steria.skuldsku.recorder.Skuldsku.config = new no.steria.skuldsku.recorder.SkuldskuConfig(config);
        no.steria.skuldsku.recorder.Skuldsku.initializeDatabaseRecorders(config.getDatabaseRecorders());
    }
}