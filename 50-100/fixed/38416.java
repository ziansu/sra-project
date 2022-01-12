@org.junit.Test
public void testBackTrace() {
    com.bio.pojo.AffineResult result = com.bio.util.SmithWaterman.getInstance().run(com.bio.test.TestSmithWaterman.SEQ_3, com.bio.test.TestSmithWaterman.SEQ_4, (-1), 2, (-1));
    assertEquals(12, result.getMaxScore());
    com.bio.util.SmithWaterman.getInstance().backTrace(com.bio.test.TestSmithWaterman.SEQ_3, com.bio.test.TestSmithWaterman.SEQ_4, result);
    assertEquals("AGCACAC-A", result.getSeqStr());
    assertEquals("A-CACACTA", result.getQueryStr());
}