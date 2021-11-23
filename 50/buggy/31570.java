@org.junit.Test
public void testProcessTex4ht() throws java.lang.Exception {
    mockRunLatex();
    mockNeedBibtexRun(false);
    mockNeedAnotherLatexRun(false);
    mockRunTex4ht();
    replay();
    processor.processTex4ht(texFile);
    verify();
}