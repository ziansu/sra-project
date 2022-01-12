public static void initialize() {
    logic.TaskProcessor.listToDisplay = new java.util.ArrayList<java.lang.String>();
    logic.ExecutedCommands.initialize();
    logic.UndoneCommands.initialize();
    logic.LogicLogger.initialize();
    try {
        logic.LogicLogger.log(java.util.logging.Level.INFO, "Initializing StorageController");
        storage.StorageController.initialize();
        logic.TaskProcessor.loadIntoDisplayList(storage.StorageController.getDisplayList());
    } catch (java.io.IOException e) {
        logic.LogicLogger.log(java.util.logging.Level.SEVERE, "Error when initializing StorageController");
        e.printStackTrace();
        java.lang.System.exit(0);
    }
}