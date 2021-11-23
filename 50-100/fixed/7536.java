@org.junit.Before
public void setUp() throws java.lang.Exception {
    formWorkflowAPIImpl = spy(new org.bonitasoft.forms.server.api.impl.FormWorkflowAPIImpl());
    expressions = new java.util.ArrayList<org.bonitasoft.forms.client.model.Expression>();
    doReturn(bpmEngineAPIUtil).when(formWorkflowAPIImpl).getBpmEngineAPIUtil();
    doReturn(processApi).when(bpmEngineAPIUtil).getProcessAPI(session);
}