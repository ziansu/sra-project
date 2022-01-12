@java.lang.Override
public void verifierInscription(java.lang.String name, model.BoatPosition position) throws exception.NomExistantException, exception.PartiePleineException, java.rmi.RemoteException {
    if ((clients.size()) >= 2) {
        throw new exception.PartiePleineException();
    }
    if (clients.contains(new interaction.Client(name, null))) {
        throw new exception.NomExistantException();
    }
}