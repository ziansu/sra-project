protected void openIfNecessary(java.lang.String url) {
    java.lang.String currentUrl = com.github.webdriverextensions.Bot.driver().getCurrentUrl();
    org.apache.http.client.utils.URIBuilder builder = null;
    try {
        builder = new org.apache.http.client.utils.URIBuilder(currentUrl);
    } catch (java.net.URISyntaxException e) {
        e.printStackTrace();
    }
    if (!(org.apache.commons.lang3.StringUtils.equalsIgnoreCase(url, builder.getHost()))) {
        com.github.webdriverextensions.Bot.driver().get(url);
    }
}