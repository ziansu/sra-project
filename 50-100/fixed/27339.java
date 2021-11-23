private void pushDeploymentModel(java.io.File orig) {
    java.lang.String[] commands = it.polimi.tower4clouds.rules.actions.CloudMLCall.Command.LOAD_DEPLOYMENT.command.split("\n");
    if ((commands.length) < 2)
        return ;
    
    wsClient.send(commands[0]);
    wsClient.send(java.lang.String.format(commands[1], getDeploymentModelFromFile(orig)));
}