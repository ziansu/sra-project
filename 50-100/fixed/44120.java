public be.cegeka.configurator.serverRegistery.ServerRegistery create() {
    be.cegeka.configurator.server.Server thisServer = serverFactory.createThisServer();
    be.cegeka.configurator.serverRegistery.Multicaster multicaster = new be.cegeka.configurator.serverRegistery.Multicaster(thisServer);
    be.cegeka.configurator.serverRegistery.Repository repository = new be.cegeka.configurator.serverRegistery.Repository(thisServer);
    be.cegeka.configurator.serverRegistery.MulticastServerRegistery multicastServerRegistery = new be.cegeka.configurator.serverRegistery.MulticastServerRegistery(multicaster, repository, serverFactory);
    return multicastServerRegistery;
}