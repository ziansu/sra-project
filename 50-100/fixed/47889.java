public void start() {
    de.webiste.database.Nutzer nutzer = de.webiste.database.Nutzer.getInstance();
    nutzer.setUser(getUser());
    nutzer.setPassword(getPwd());
    try {
        de.website.Bean.DbQuery dBcon = new de.website.Bean.DbQuery();
        moveToAdminPage();
    } catch (java.lang.Exception exc) {
        moveToErrorPage();
    }
}