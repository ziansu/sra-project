public boolean buyGame(java.lang.String username, java.lang.String name) {
    es.deusto.server.db.User u = showUser(username);
    es.deusto.server.db.Game g = showGame(name);
    es.deusto.server.db.License l = g.getFirstFreeLicense();
    return addLicenseToUser(u, l);
}