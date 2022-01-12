public void startInstances(java.util.List<java.lang.String> instances) {
    if (!(isConnected))
        return ;
    
    if ((instances.size()) == 0) {
        it.polimi.modaclouds.scalingrules.utils.CloudMLNew.logger.debug("No instance to start.");
        return ;
    }
    it.polimi.modaclouds.scalingrules.utils.CloudMLNew.logger.debug("Starting {} instances...", instances.size());
    org.cloudml.facade.commands.CloudMlCommand cmd = fcommand.startComponent(instances);
    cml.fireAndWait(cmd);
    it.polimi.modaclouds.scalingrules.utils.CloudMLNew.logger.debug("...done!");
}