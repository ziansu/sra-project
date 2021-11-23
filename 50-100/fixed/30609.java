public static java.lang.String[] getSparqlBasedCrawlerDBPediaEndpoints() {
    java.util.List<java.lang.String> result = new java.util.ArrayList<java.lang.String>();
    for (int i = 1; i < 100; ++i) {
        if (CrawlerConfig.props.containsKey(("crawler.sparql_based.dbpedia_endpoint" + i)))
            result.add(CrawlerConfig.props.getProperty(("crawler.sparql_based.dbpedia_endpoint" + i)));
        
    }
    return result.toArray(new java.lang.String[result.size()]);
}