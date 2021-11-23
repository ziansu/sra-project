@org.junit.Test(expected = com.google.api.server.spi.response.NotFoundException.class)
public void testGetGroupUsersNotFoundViaFieldValueException() throws java.lang.Exception {
    com.jasify.schedule.appengine.model.common.OrganizationService service = com.jasify.schedule.appengine.model.common.OrganizationServiceFactory.getOrganizationService();
    com.google.appengine.api.datastore.Key key = org.slim3.datastore.Datastore.allocateId(com.jasify.schedule.appengine.model.common.Group.class);
    service.getGroup(key);
    expectLastCall().andThrow(new com.jasify.schedule.appengine.model.EntityNotFoundException(((java.lang.String) (null))));
    testOrganizationServiceFactory.replay();
    endpoint.getGroupUsers(com.jasify.schedule.appengine.spi.JasifyEndpointTest.newAdminCaller(55), key);
}