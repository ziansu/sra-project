public ServerOperation sendClientOperationToServer() {
    while (!(serverOperations.isEmpty())) {
        processChange();
    } 
    Operation operation = clientGraph.generateClientOperationForServer();
    clientGraph.setSentOperationKey(clientGraph.getCurrentClientNode().getHashKey());
    return new ServerOperation(operation, clientGraph.getCurrentClientNode().getHashKey(), clientGraph.getCurrentServerNode().getHashKey());
}