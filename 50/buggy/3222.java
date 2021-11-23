@org.junit.Before
public void setUp() throws java.lang.Exception {
    caseDatastore = org.mockito.Mockito.spy(new org.bonitasoft.web.rest.server.datastore.bpm.cases.CaseDatastore(org.mockito.Mockito.mock(org.bonitasoft.engine.session.APISession.class)));
    org.mockito.Mockito.doReturn(processAPI).when(caseDatastore).getProcessAPI();
}