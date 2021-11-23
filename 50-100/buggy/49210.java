@org.junit.Before
public void setUp() {
    super.setUp();
    project = createProject();
    final org.mockenger.data.model.persistent.mock.group.Group group = createGroup(project.getId(), false);
    createRequest(createSoapMockRequest(group.getId()));
    endpoint = java.lang.String.format(org.mockenger.core.web.controller.endpoint.SoapControllerTest.ENDPOINT_TEMPLATE, group.getCode(), org.mockenger.core.web.controller.endpoint.SoapControllerTest.REQUEST_PATH);
}