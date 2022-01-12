@org.junit.Test
public void getPerlVersionCallsProcessBuilderFactory() throws java.lang.Exception {
    processbuilder.PerlProcessBuilderFactory factory = org.mockito.Mockito.mock(processbuilder.PerlProcessBuilderFactory.class);
    processbuilder.utils.PerlProcessBuilderUtilities processBuilderUtilitiesMock = org.mockito.Mockito.spy(processbuilder.utils.PerlProcessBuilderUtilities.class);
    org.mockito.Mockito.when(factory.getProcessBuilder(org.mockito.Matchers.<java.lang.String[]>anyVararg())).thenReturn(new java.lang.ProcessBuilder(""));
    jsr223.perl.utils.PerlVersionGetter perlVersionGetter = new jsr223.perl.utils.PerlVersionGetter(processBuilderUtilitiesMock);
    perlVersionGetter.getPerlVersion(factory);
    org.mockito.Mockito.verify(factory).getProcessBuilder(org.mockito.Matchers.<java.lang.String[]>anyVararg());
}