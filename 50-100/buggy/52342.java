@org.junit.Test
public void testArgumentNotRequired() throws java.lang.Exception {
    org.aesh.command.impl.parser.CommandLineParser<org.aesh.cl.CompletionParserTest.ParseCompleteTest3> clp = new org.aesh.command.impl.container.AeshCommandContainerBuilder<org.aesh.cl.CompletionParserTest.ParseCompleteTest3>().create(org.aesh.cl.CompletionParserTest.ParseCompleteTest3.class).getParser();
    org.aesh.command.invocation.InvocationProviders ip = org.aesh.console.settings.SettingsBuilder.builder().build().invocationProviders();
    org.aesh.complete.AeshCompleteOperation co = new org.aesh.complete.AeshCompleteOperation(aeshContext, "test ", 100);
    clp.complete(co, ip);
    org.junit.Assert.assertEquals(4, co.getFormattedCompletionCandidates().size());
}