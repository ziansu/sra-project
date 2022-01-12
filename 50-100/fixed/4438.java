public void login(java.lang.String username, java.lang.String password) {
    status = nl.gerben_meijer.gerryflap.c1000roosters.C1000.C1000Login.STATUS_LOGGIN_IN;
    org.jsoup.Connection.Response response = getSite(true);
    if (response != null) {
        java.lang.String out = postData(getToken(response), username, password);
        java.lang.System.out.println(cookies);
        session = cookies.get("pmt_real_session");
        status = nl.gerben_meijer.gerryflap.c1000roosters.C1000.C1000Login.STATUS_LOGGED_IN_NO_ID;
        return ;
    }
    status = nl.gerben_meijer.gerryflap.c1000roosters.C1000.C1000Login.STATUS_LOGGED_OUT;
}