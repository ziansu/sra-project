@org.junit.Test
public void testUserInitialization() {
    it.geosolutions.geostore.services.rest.model.UserList ul = geoStoreClient.getUsers(0, 100);
    org.junit.Assert.assertEquals(2, ul.getList().size());
    for (it.geosolutions.geostore.services.rest.model.RESTUser u : ul.getList()) {
        org.junit.Assert.assertNull(u.getGroupsNames());
    }
}