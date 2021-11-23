@org.junit.Test
public void testProcessLatexWithBibtex() throws java.lang.Exception {
    mockRunLatex();
    mockNeedBibtexRun(true);
    mockRunBibtex();
    mockNeedAnotherLatexRun(true);
    mockRunLatex();
    mockNeedAnotherLatexRun(true);
    mockRunLatex();
    mockNeedAnotherLatexRun(false);
    replay();
    processor.processLatex(texFile);
    verify();
}