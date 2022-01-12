@org.junit.Test
public void testArgs_invalidOption() throws org.apache.commons.cli.ParseException {
    org.apache.commons.cli.CommandLineParser parser = new org.apache.commons.cli.DefaultParser();
    try {
        parser.parse(options, new java.lang.String[]{ "-i" , "-xyz" });
        org.junit.Assert.fail();
    } catch (org.apache.commons.cli.UnrecognizedOptionException e) {
        org.junit.Assert.assertEquals("Unrecognized option: -xyz", e.getMessage());
    }
}