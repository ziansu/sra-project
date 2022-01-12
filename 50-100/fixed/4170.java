public static void init(final java.lang.String indexFile, final java.lang.String tfidfFile, final java.lang.String dfFile, final boolean storeIndexOnDrive) throws java.io.IOException {
    if (!(de.citec.sc.templates.DocumentSimilarityTemplate.isInitialized)) {
        de.citec.sc.similarity.database.FileDB.loadIndicies(indexFile, tfidfFile, storeIndexOnDrive);
        de.citec.sc.templates.DocumentSimilarityTemplate.dfFile = dfFile;
        de.citec.sc.similarity.tfidf.IDFProvider.getIDF(dfFile);
        de.citec.sc.templates.DocumentSimilarityTemplate.lemmatizer = new de.citec.sc.helper.StanfordLemmatizer();
        de.citec.sc.templates.DocumentSimilarityTemplate.NUMBER_OF_WIKI_DOCUMENTS = de.citec.sc.wikipedia.preprocess.WikipediaTFIDFVector.countLines(tfidfFile);
        de.citec.sc.templates.DocumentSimilarityTemplate.isInitialized = true;
    }
}