private void initIdx(java.lang.String path) {
    org.talend.dataquality.standardization.index.SynonymIndexBuilder builder = new org.talend.dataquality.standardization.index.SynonymIndexBuilder();
    builder.deleteIndexFromFS(path);
    builder.initIndexInFS(path);
    for (java.lang.String[] synonyms : org.talend.dataquality.standardization.index.SynonymIndexBuilderTest.synonyms) {
        try {
            builder.insertDocument(synonyms[0], synonyms[1]);
        } catch (java.io.IOException e) {
            e.printStackTrace();
            org.junit.Assert.fail("should not get an exception here");
        }
    }
    builder.closeIndex();
}