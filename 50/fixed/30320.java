public void deploy(java.io.File orig) {
    pushDeploymentModel(orig);
    wsClient.sendBlocking(it.polimi.modaclouds.scalingrules.utils.CloudML.Command.DEPLOY.command, ((it.polimi.modaclouds.scalingrules.utils.CloudML.WSClient.TIMEOUT) * 2), it.polimi.modaclouds.scalingrules.utils.CloudML.Command.DEPLOY);
}