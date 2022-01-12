@org.junit.Test(expected = com.google.api.server.spi.response.NotFoundException.class)
public void testAddUserToGroupNotFoundViaFieldValueException() throws java.lang.Exception {
    com.jasify.schedule.appengine.model.common.OrganizationService service = com.jasify.schedule.appengine.model.common.OrganizationServiceFactory.getOrganizationService();
    com.google.appengine.api.datastore.Key groupId = org.slim3.datastore.Datastore.allocateId(com.jasify.schedule.appengine.model.common.Group.class);
    com.google.appengine.api.datastore.Key userId = org.slim3.datastore.Datastore.allocateId(com.jasify.schedule.appengine.model.users.User.class);
    service.addUserToGroup(groupId, userId);
    expectLastCall().andThrow(new com.jasify.schedule.appengine.model.EntityNotFoundException(((java.lang.String) (null))));
    testOrganizationServiceFactory.replay();
    endpoint.addUserToGroup(com.jasify.schedule.appengine.spi.JasifyEndpointTest.newAdminCaller(55), groupId, userId);
}