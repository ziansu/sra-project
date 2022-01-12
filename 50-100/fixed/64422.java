public void login(java.lang.String username, java.lang.String password) throws org.wikidata.wdtk.wikibaseapi.LoginFailedException {
    try {
        java.lang.String token = this.getLoginToken(username, password);
        try {
            this.confirmLogin(token, username, password);
        } catch (org.wikidata.wdtk.wikibaseapi.NeedTokenException e) {
            token = this.getLoginToken(username, password);
            this.confirmLogin(token, username, password);
        }
    } catch (java.io.IOException e1) {
        throw new org.wikidata.wdtk.wikibaseapi.LoginFailedException(e1.getMessage());
    }
}