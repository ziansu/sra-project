private org.jsoup.nodes.Document getDocument(java.lang.String city, java.lang.String vacancy, int page) throws java.io.IOException {
    java.lang.String s = java.lang.String.format(com.nazjara.aggregator.model.RabotaPlusStrategy.URL_FORMAT, java.net.URLEncoder.encode(vacancy, "UTF-8"), java.net.URLEncoder.encode(city, "UTF-8"), page);
    return org.jsoup.Jsoup.connect(s).userAgent(com.nazjara.aggregator.model.RabotaPlusStrategy.userAgent).referrer(com.nazjara.aggregator.model.RabotaPlusStrategy.referrer).get();
}