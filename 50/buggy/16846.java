private void initStorage() {
    try {
        storage = new dooyit.storage.StorageController();
    } catch (java.io.IOException e) {
        dooyit.logic.api.LogicController.logger.log(java.util.logging.Level.SEVERE, "ERROR: Fail to create storage");
        uiController.displayMessage("ERROR: CREATING STORAGE");
    }
}