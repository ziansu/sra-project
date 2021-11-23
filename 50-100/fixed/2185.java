public void deleteResolution(int index) {
    com.uwsoft.editor.renderer.data.ResolutionEntryVO resolutionEntryVO = dataManager.getCurrentProjectInfoVO().resolutions.remove(index);
    try {
        org.apache.commons.io.FileUtils.deleteDirectory(new java.io.File((((((dataManager.getWorkspacePath()) + "/") + (dataManager.currentProjectVO.projectName)) + "/assets/") + (resolutionEntryVO.name))));
    } catch (java.io.IOException ignored) {
        ignored.printStackTrace();
    }
    dataManager.saveCurrentProject();
    dataManager.openProjectAndLoadAllData(dataManager.currentProjectVO.projectName, "orig");
}