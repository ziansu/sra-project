@java.lang.Override
protected jd.http.Browser prepBrowser(final jd.http.Browser prepBr, final java.lang.String host) {
    if (!((browserPrepped.containsKey(prepBr)) && ((browserPrepped.get(prepBr)) == (java.lang.Boolean.TRUE)))) {
        super.prepBrowser(prepBr, host);
        prepBr.setCookie(jd.plugins.hoster.RockFileEu.COOKIE_HOST, "lang", "english");
        prepBr.setCookie(jd.plugins.hoster.RockFileEu.COOKIE_HOST, "langAuto", "0");
    }
    return prepBr;
}