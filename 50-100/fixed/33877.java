public com.speearth.model.core.Impiegato login(java.lang.String username, java.lang.String password) {
    com.speearth.model.core.Impiegato utente = com.speearth.model.core.AgenziaFacade.getInstance().getRegistroImpiegati().cercaImpiegatoDaUsername(username);
    if ((utente != null) && (utente.getPassword().equals(password))) {
        com.speearth.controller.AppFacadeController.getInstance().setUtente(utente);
        return utente;
    }
    return null;
}