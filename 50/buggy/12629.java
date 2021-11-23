public boolean registrieren(java.lang.String name, java.lang.String passwort) {
    return dao.push(((name + ";") + passwort));
}