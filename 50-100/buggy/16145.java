@org.junit.Test
public void testArgs_invalidIntegerValue() throws org.apache.commons.cli.ParseException {
    org.apache.commons.cli.CommandLineParser parser = new org.apache.commons.cli.DefaultParser();
    org.apache.commons.cli.CommandLine commandLine = parser.parse(options, new java.lang.String[]{ "abc" , "-i" , "-r" , "invalidIntegerValue" });
    org.junit.Assert.assertTrue(commandLine.hasOption("r"));
    org.junit.Assert.assertNull(commandLine.getParsedOptionValue("r"));
}