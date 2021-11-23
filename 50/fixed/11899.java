public void loadFromStorage() {
    try {
        loadCategoryData();
        loadTaskData();
    } catch (java.io.IOException e) {
        dooyit.logic.api.LogicController.logger.log(java.util.logging.Level.SEVERE, "ERROR: Fail to load task from storage");
    }
}