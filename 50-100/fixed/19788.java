private void loadStreamTable() {
    try {
        if ((currentLoadedProfile) != null) {
            selectedFile = new java.io.File(com.exalttech.trex.util.ProfileManager.getInstance().getProfileFilePath(currentLoadedProfile));
            currentLoadedProfilesList = tableView.loadStreamTable(selectedFile);
            profileViewWrapper.getChildren().clear();
            profileViewWrapper.getChildren().add(tableView);
        }
    } catch (java.lang.Exception ex) {
        com.exalttech.trex.ui.controllers.TrafficProfileDialogController.LOG.error("Error loading stream table", ex);
    }
}