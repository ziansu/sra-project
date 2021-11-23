@java.lang.SuppressWarnings(value = "unused")
private void getInstanceInfo(java.lang.String id) {
    if ((id == null) || (!(isConnected)))
        return ;
    
    it.polimi.modaclouds.scalingrules.utils.CloudMLNew.logger.debug("Retrieving the information about the instance {}...", id);
    org.cloudml.facade.commands.CloudMlCommand cmd = fcommand.snapshot((("/componentInstances[id='" + id) + "']"));
    cml.fireAndWait(cmd);
    it.polimi.modaclouds.scalingrules.utils.CloudMLNew.logger.debug("...done!");
}