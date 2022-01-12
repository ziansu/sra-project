private java.net.URL napraviURL(java.lang.String period, java.lang.String dbstr, java.lang.String vrijemeStr) throws java.net.MalformedURLException {
    java.lang.String urlString = urlPredlozak;
    urlString = urlString.replaceFirst("\\$\\{PERIOD\\}", period);
    urlString = urlString.replaceFirst("\\$\\{DB\\}", dbstr);
    urlString = urlString.replaceFirst("\\$\\{POCETAK\\}", vrijemeStr);
    return new java.net.URL(urlString);
}