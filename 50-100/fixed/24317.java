public java.lang.String login(java.lang.String username, java.lang.String password) {
    org.ambulatorio.ibim.models.Operatore utente = dao.getOperatoreBy(username, password);
    if (utente != null) {
        this.operatoreLoggato = utente;
        return null;
    }else {
        org.ambulatorio.ibim.utils.MessagesView.error("Error!", (("User " + username) + " is not registered."));
        return null;
    }
}