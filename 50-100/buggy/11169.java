public java.lang.String translate(java.lang.String str) {
    java.lang.String url = buildQuery(str);
    java.lang.String content = null;
    try {
        content = http.HttpGet.download(url);
        java.lang.System.out.println(content);
    } catch (java.net.MalformedURLException e) {
        java.lang.System.out.printf("Could not encode %s\n", str);
        return null;
    } catch (java.io.IOException e) {
        java.lang.System.out.printf("Error while downloading %s (%s)\n", url, e.getMessage());
        return null;
    }
    return content;
}