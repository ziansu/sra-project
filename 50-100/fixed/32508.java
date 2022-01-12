private void configureParserByDomain(java.lang.Integer id, java.lang.String url, org.jsoup.nodes.Document doc) {
    edu.carleton.comp4601.project.dao.ProductType type = null;
    edu.carleton.comp4601.project.dao.Product product = null;
    if ((url.contains(retailer.getProductRoot())) && ((retailer.getName()) == (edu.carleton.comp4601.project.dao.RetailerName.NCIX))) {
        type = isValidNCIXProduct(doc);
        if (type != null) {
            edu.carleton.comp4601.project.crawl.ProductParser productParser = new edu.carleton.comp4601.project.crawl.ProductParser(retailer, doc);
            product = productParser.parseProductOfType(type, url);
        }
    }
    addProductToDatabase(product);
}