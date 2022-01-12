@java.lang.Override
java.util.List<nl.fhict.happynews.crawler.model.quoteapi.QuoteEnvelope> getRaw() {
    java.util.List<nl.fhict.happynews.crawler.model.quoteapi.QuoteEnvelope> result = new java.util.ArrayList<>();
    result.add(quoteApi.getRaw(nl.fhict.happynews.crawler.crawler.QuoteCrawler.categories[nl.fhict.happynews.crawler.crawler.QuoteCrawler.catIndex]));
    if ((++(nl.fhict.happynews.crawler.crawler.QuoteCrawler.catIndex)) > (nl.fhict.happynews.crawler.crawler.QuoteCrawler.categories.length)) {
        nl.fhict.happynews.crawler.crawler.QuoteCrawler.catIndex = 0;
    }
    return result;
}