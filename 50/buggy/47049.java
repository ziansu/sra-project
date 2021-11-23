@org.junit.Test
public void testProcessLatexSimple() throws java.lang.Exception {
    mockRunLatex();
    mockNeedBibtexRun(false);
    mockNeedAnotherLatexRun(false);
    replay();
    processor.processLatex(texFile);
    verify();
}