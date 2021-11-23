@java.lang.Override
public model.Grille verifierInscription(java.lang.String name, model.BoatPosition position) throws exception.NomExistantException, exception.PartiePleineException, java.rmi.RemoteException {
    if ((clients.size()) >= 2) {
        throw new exception.PartiePleineException();
    }
    if (clients.contains(new interaction.Client(name, null))) {
        throw new exception.NomExistantException();
    }
    model.Grille grille = new model.Grille(position);
    return grille;
}