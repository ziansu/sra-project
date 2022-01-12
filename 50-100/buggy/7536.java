@org.junit.Before
public void setUp() throws java.lang.Exception {
    formWorkflowAPIImpl = org.mockito.Mockito.spy(new org.bonitasoft.forms.server.api.impl.FormWorkflowAPIImpl());
    expressions = new java.util.ArrayList<org.bonitasoft.forms.client.model.Expression>();
    org.mockito.Mockito.doReturn(bpmEngineAPIUtil).when(formWorkflowAPIImpl).getBpmEngineAPIUtil();
    org.mockito.Mockito.doReturn(processApi).when(bpmEngineAPIUtil).getProcessAPI(session);
}