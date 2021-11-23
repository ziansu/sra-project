private void check(com.gargoylesoftware.htmlunit.WebClient wc, com.gargoylesoftware.htmlunit.HttpMethod m) throws java.io.IOException {
    com.gargoylesoftware.htmlunit.TextPage p = wc.getPage(new com.gargoylesoftware.htmlunit.WebRequestSettings(new java.net.URL(url, "verbMatch/"), m));
    assertEquals((("Got " + (m.name())) + "\n"), p.getContent());
}