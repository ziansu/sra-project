@org.junit.Test
public void testParseEqTerm() {
    java.lang.String s = "c-try(S,I)";
    model.CafeTerm t = model.TermParser.parseEqTerm(s);
    org.junit.Assert.assertEquals("", t.getOpName(), "c-try");
    org.junit.Assert.assertEquals("", t.getArgs().get(0), "S");
}