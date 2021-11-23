public void deploy(java.io.File orig, java.lang.Object... substitutions) {
    if (!(isConnected))
        return ;
    
    pushDeploymentModel(orig, substitutions);
    it.polimi.modaclouds.scalingrules.utils.CloudMLNew.logger.debug("Deploy...");
    org.cloudml.facade.commands.CloudMlCommand cmd = fcommand.deploy();
    cml.fireAndWait(cmd);
    it.polimi.modaclouds.scalingrules.utils.CloudMLNew.logger.debug("...done!");
    getDeploymentModel();
}