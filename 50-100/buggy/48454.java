@org.junit.Test
public void testBadGet() {
    org.easymock.EasyMock.expect(mockHostService.getHost(org.onosproject.net.HostId.hostId("00:00:11:00:00:01/1"))).andReturn(null).anyTimes();
    org.easymock.EasyMock.replay(mockHostService);
    com.sun.jersey.api.client.WebResource rs = resource();
    try {
        rs.path("hosts/00:00:11:00:00:01/1").get(java.lang.String.class);
        org.junit.Assert.fail("Fetch of non-existent host did not throw an exception");
    } catch (com.sun.jersey.api.client.UniformInterfaceException ex) {
        org.junit.Assert.assertThat(ex.getMessage(), org.hamcrest.Matchers.containsString("returned a response status of"));
    }
}