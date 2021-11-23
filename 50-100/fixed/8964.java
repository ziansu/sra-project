@org.junit.Before
public void setUp() {
    tested = new net.remotehost.domdetective.parser.TemplateParser();
    org.mockito.BDDMockito.given(propertiesParser.getArray(org.mockito.Matchers.anyString(), org.mockito.Matchers.any())).willReturn(new java.lang.String[]{ "something" , "else" , "misconfiguration" });
}