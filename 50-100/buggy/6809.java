private void actionApresClickCorrect(int x, int y) {
    try {
        enAttente = true;
        java.rmi.registry.Registry reg = java.rmi.registry.LocateRegistry.getRegistry(3212);
        interaction.ServeurInterface serveur = ((interaction.ServeurInterface) (reg.lookup("Serv")));
        positionCourante = new model.Position(x, y);
        serveur.sendPosition(positionCourante);
    } catch (java.rmi.RemoteException | java.rmi.NotBoundException ex) {
        java.util.logging.Logger.getLogger(graphic.StageJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}