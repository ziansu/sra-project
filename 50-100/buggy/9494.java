@org.junit.Test
public void testTfMapCalculation() throws java.io.IOException, java.lang.InterruptedException {
    java.util.Map<java.lang.String, java.lang.Double> tfMap1 = tfidf.TfidfUtils.getTfMap(tfidf.TfidfUtils.getWordsArrayOfContent(doc1Content));
    java.util.Map<java.lang.String, java.lang.Double> tfMap2 = tfidf.TfidfUtils.getTfMap(tfidf.TfidfUtils.getWordsArrayOfContent(doc2Content));
    org.junit.Assert.assertEquals(tfMap1, doc1ExpectedTfMap);
    org.junit.Assert.assertEquals(tfMap2, doc2ExpectedTfMap);
}