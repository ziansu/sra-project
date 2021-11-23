@org.junit.Test
public void ExecuteTest() throws java.io.IOException, org.grouplens.lenskit.RecommenderBuildException {
    tempEval.execute();
    assertTrue(predictOutputFile.isFile());
    java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(predictOutputFile));
    try {
        long count = br.lines().count();
        assertThat(count, equalTo(35L));
    } finally {
        br.close();
    }
}