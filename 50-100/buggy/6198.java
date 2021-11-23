public Utente getUser(int id) throws UserException {
    Utente u = null;
    boolean already_in = this.persone.containsKey(id);
    if (already_in) {
        u = this.persone.get(id);
        java.lang.System.out.println(u);
    }else {
        throw new UserException((("id " + id) + " non presente nella rete sociale"));
    }
    return u;
}