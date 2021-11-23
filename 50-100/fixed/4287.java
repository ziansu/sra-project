public static void updateGameModel() {
    int oldVersion = -1;
    if ((client.facade.CatanFacade.model) != null)
        oldVersion = client.facade.CatanFacade.model.getVersion();
    
    try {
        client.facade.CatanFacade.model = client.facade.CatanFacade.proxy.getGameModel(oldVersion);
    } catch (shared.exceptions.ServerException ex) {
        java.util.logging.Logger.getLogger(client.paller.ServerPallTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    int newVersion = client.facade.CatanFacade.model.getVersion();
    if (oldVersion != newVersion) {
        client.facade.CatanFacade.setModel(client.facade.CatanFacade.model);
        client.facade.CatanFacade.observable.notifyObservers();
    }
}