private <T extends org.smof.element.Element> void createIndexes(java.lang.Class<T> elClass) {
    final org.smof.parsers.TypeParser<T> typeMetadata = parser.getTypeParser(elClass);
    final org.smof.collection.SmofCollection<T> collection = collections.getCollection(elClass);
    for (org.smof.index.InternalIndex index : typeMetadata.getIndexes()) {
        collection.getMongoCollection().createIndex(index.getIndex());
    }
}