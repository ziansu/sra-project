private static java.io.InputStream getYQXMLInputStream(final java.util.Set<java.lang.String> symbols) throws java.lang.Exception {
    java.net.URL url = new java.net.URL(datafetching.YFDataFetcher.getBaseUrl(symbols));
    java.net.HttpURLConnection conn = ((java.net.HttpURLConnection) (url.openConnection()));
    if ((conn.getResponseCode()) != 200)
        throw new java.io.IOException(conn.getResponseMessage());
    
    return conn.getInputStream();
}