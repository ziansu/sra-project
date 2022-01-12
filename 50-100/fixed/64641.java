private void addRowAndAssertContents(java.lang.String expected) {
    try {
        this.infileDataBuffer.addRowToInfile();
        org.junit.Assert.assertEquals(expected, com.google.common.io.CharStreams.toString(new java.io.InputStreamReader(this.infileDataBuffer.asInputStream())));
    } catch (java.io.IOException ex) {
        throw com.google.common.base.Throwables.propagate(ex);
    }
}