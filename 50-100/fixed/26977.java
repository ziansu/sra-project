public double[] distributionForInstance(focusedCrawler.target.model.Page page) throws focusedCrawler.target.classifier.TargetClassifierException {
    double[] result = null;
    try {
        double[] values = getValues(page);
        synchronized(classifier) {
            focusedCrawler.target.classifier.Instance instanceWeka = new focusedCrawler.target.classifier.Instance(1, values);
            instanceWeka.setDataset(instances);
            result = classifier.distributionForInstance(instanceWeka);
        }
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        throw new focusedCrawler.target.classifier.TargetClassifierException(ex.getMessage());
    }
    return result;
}