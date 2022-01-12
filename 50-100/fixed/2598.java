public void deploy(java.io.File orig) {
    if (!(isConnected))
        return ;
    
    pushDeploymentModel(orig);
    it.polimi.modaclouds.scalingrules.utils.CloudMLNew.logger.debug("Deploy...");
    org.cloudml.facade.commands.CloudMlCommand cmd = fcommand.deploy();
    cml.fireAndWait(cmd);
    it.polimi.modaclouds.scalingrules.utils.CloudMLNew.logger.debug("...done!");
    getDeploymentModel();
}