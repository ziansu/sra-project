public void save(java.util.List<io.djigger.model.TaggedMetric> metrics) {
    java.util.List<org.bson.Document> documents = new java.util.ArrayList<>();
    for (io.djigger.model.TaggedMetric metric : metrics) {
        org.bson.Document document = toDocument(metric);
        documents.add(document);
        log(document);
    }
    metricsCollection.insertMany(documents);
}