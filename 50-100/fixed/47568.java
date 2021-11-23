public be.cegeka.configurator.serverRegistery.ServerRegistery create(be.cegeka.configurator.messageProcessor.MessageProcessor messageProcessor) throws java.io.IOException {
    be.cegeka.configurator.server.Server thisServer = serverFactory.createThisServer(messageProcessor.getPort().get());
    be.cegeka.configurator.serverRegistery.JoinProtocol joinProtocol = new be.cegeka.configurator.serverRegistery.JoinProtocol(thisServer);
    be.cegeka.configurator.serverRegistery.Repository repository = new be.cegeka.configurator.serverRegistery.Repository(thisServer);
    be.cegeka.configurator.serverRegistery.MulticastServerRegistery multicastServerRegistery = new be.cegeka.configurator.serverRegistery.MulticastServerRegistery(joinProtocol, repository, serverFactory);
    java.util.List<? extends be.cegeka.configurator.messageProcessor.MessageHandler> messageHandlers = multicastServerRegistery.getMessageHandlers();
    for (be.cegeka.configurator.messageProcessor.MessageHandler messageHandler : messageHandlers) {
        messageProcessor.addMessageHandler(messageHandler);
    }
    return multicastServerRegistery;
}