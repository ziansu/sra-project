@org.junit.Test
public void computeF1score() throws java.lang.Exception {
    org.atilf.module.disambiguation.ComputeTotalTermsScoreTest._totalTermScore.setRecall(0.5F);
    org.atilf.module.disambiguation.ComputeTotalTermsScoreTest._totalTermScore.setPrecision(0.5F);
    org.atilf.module.disambiguation.ComputeTotalTermsScoreTest._computeTotalTermsScore.computeF1score();
    org.junit.Assert.assertEquals("the f1 score must be equals to : ", 0.5F, org.atilf.module.disambiguation.ComputeTotalTermsScoreTest._totalTermScore.getF1score(), 0.0F);
}