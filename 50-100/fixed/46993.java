@org.junit.Test
public void checkForDuplicateSemicolon() throws java.lang.Exception {
    java.lang.String s = "MACHINE MissingSemicolon\nSETS\nID={aa,bb}\nVARIABLES xx\nINVARIANT\nxx:ID\nINITIALISATION xx:=iv\nOPERATIONS\n Set(yy) = PRE yy:ID THEN xx:= yy END;\n ;r <-- Get = BEGIN r := xx END\nEND";
    try {
        getTreeAsString(s);
        org.junit.Assert.fail("Missing Semicolon was not detected");
    } catch (de.be4.classicalb.core.parser.exceptions.BException e) {
        org.junit.Assert.assertTrue(e.getMessage().startsWith("Two succeeding"));
    }
}