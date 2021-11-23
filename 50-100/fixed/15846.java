static org.jsoup.nodes.Document get(java.lang.String url) {
    org.jsoup.nodes.Document doc = new org.jsoup.nodes.Document(url);
    try {
        org.jsoup.Connection.Response response = org.jsoup.Jsoup.connect(url).execute();
        if ((response.statusCode()) == 200) {
            doc = response.parse();
        }else {
            java.lang.System.err.println(("Error Code: " + (response.statusCode())));
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return doc;
}