@org.junit.Test
public void GE8() throws java.lang.Exception {
    boolean actual;
    boolean expected;
    java.net.URL file = Benchmarks.BenchmarkTests.class.getResource("ge8.jta");
    JTASyntax.Program program = Parser.ProgramParser.loadProgramFromFile(file);
    JTAFinder.AbstractFinder finder = new JTAFinder.UnmatchedEndpoint.UmEPFinder(program);
    assertFalse((actual = finder.verify()));
    Regression.Syntax.Program old = Regression.ProgramFactory.GE8();
    Finder.UnmatchedEP_Finder old_finder = new Finder.UnmatchedEP_Finder(old);
    assertFalse((expected = old_finder.run()));
    assertEquals(actual, expected);
}