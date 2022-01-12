@org.junit.Test
public void SetDataSourceDaoTest() throws java.io.IOException, org.grouplens.lenskit.RecommenderBuildException {
    tempEval.setDataSource(dao);
    tempEval.execute();
    assertTrue(predictOutputFile.isFile());
    java.io.FileInputStream input = new java.io.FileInputStream(predictOutputFile);
    try {
        java.nio.channels.FileChannel channel = input.getChannel();
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(predictOutputFile));
        assertThat(br.lines().count(), equalTo(35L));
    } finally {
        input.close();
    }
}