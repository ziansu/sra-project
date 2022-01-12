public com.hp.application.automation.tools.model.MCServerSettingsModel getMCServerSettingsModel() {
    for (com.hp.application.automation.tools.model.MCServerSettingsModel mcServer : getDescriptor().getMcServers()) {
        if (((((this.runFromFileModel) != null) && ((runFromFileModel.getMcServerName()) != null)) && ((mcServer.getMcServerName()) != null)) && (runFromFileModel.getMcServerName().equals(mcServer.getMcServerName()))) {
            return mcServer;
        }
    }
    return null;
}