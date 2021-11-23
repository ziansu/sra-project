@org.junit.Before
public void setUp() throws java.lang.Exception {
    caseDatastore = spy(new org.bonitasoft.web.rest.server.datastore.bpm.cases.CaseDatastore(mock(org.bonitasoft.engine.session.APISession.class)));
    doReturn(processAPI).when(caseDatastore).getProcessAPI();
}