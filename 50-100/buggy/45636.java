@org.junit.Test
public void testTfidfResultCalculation() throws java.io.IOException, java.lang.InterruptedException {
    tfidf.TfidfCalculator calculator = new tfidf.TfidfCalculator(testDocsPath, 2);
    tfidf.entities.TfidfResult result = calculator.calculate(new tfidf.IContentRetriever() {
        @java.lang.Override
        public java.lang.String[] getContent(java.lang.String contentIdentifier) throws java.lang.Exception {
            try (java.io.InputStream stream = new java.io.FileInputStream(contentIdentifier)) {
                java.lang.String fileAsString = tfidf.TfidfUtils.inputStreamToString(stream);
                return tfidf.TfidfUtils.getWordsArrayOfContent(fileAsString);
            }
        }
    });
    org.junit.Assert.assertEquals(result, expectedResult);
}