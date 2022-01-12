public static Runner.StockInfo classify(java.lang.String stockIndex) throws java.io.IOException, javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXException {
    bayes.Classifier classifier = new bayes.BayesClassifier();
    network.StockHistoryModule stock = new network.StockHistoryModule();
    boolean increasing = stock.isStockIncreasing(stockIndex);
    Runner.learn(classifier, stockIndex);
    bayes.Classification classification = Runner.classify(classifier, stockIndex);
    return new Runner.StockInfo(increasing, (classification.getCategory().equals(Runner.POSITIVE) ? true : false));
}