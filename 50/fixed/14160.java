public void testPropagationForVariantsOfNX_P78324() throws java.lang.Exception {
    int errorCnt = getErrorsDuringPropagationOnVariantsOfSingleEntry("NX_P78324");
    junit.framework.Assert.assertEquals(0, errorCnt);
}