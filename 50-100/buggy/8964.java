@org.junit.Before
public void setUp() {
    tested = new net.remotehost.domdetective.parser.TemplateParser();
    org.mockito.BDDMockito.given(propertiesParser.getArray(org.mockito.Matchers.any(), org.mockito.Matchers.anyString(), org.mockito.Matchers.anyString())).willReturn(java.util.Optional.of(new java.lang.String[]{ "something" , "else" , "misconfiguration" }));
}