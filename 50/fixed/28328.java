private jd.http.Browser prepBrowser(jd.http.Browser prepBr) {
    prepBr.getHeaders().put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:32.0) Gecko/20100101 Firefox/32.0");
    return prepBr;
}