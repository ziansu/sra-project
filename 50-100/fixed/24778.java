void processAction() {
    java.util.List<java.lang.String> links = crawler.getLinks();
    java.lang.String link;
    java.lang.String[] results;
    for (int i = 0; i < (links.size()); i++) {
        link = links.get(i);
        results = crawler.processLink(link);
        crawler.setTableRow(i, results);
    }
}