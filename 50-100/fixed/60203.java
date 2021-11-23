@org.junit.Test
public void testDropOrganization() throws java.lang.Exception {
    java.lang.String org = "DropOrganization";
    java.lang.String id = "DropOrganization_id";
    organizationFacade.createOrganization(id, org);
    final javax.ws.rs.client.Client client = javax.ws.rs.client.ClientBuilder.newBuilder().build();
    client.target(TARGET_URI).path(((io.lumeer.engine.rest.OrganizationServiceIntegrationTest.PATH_PREFIX) + id)).request(MediaType.APPLICATION_JSON).buildDelete().invoke();
    org.assertj.core.api.Assertions.assertThat(organizationFacade.readOrganizationsMap()).doesNotContainEntry(id, org);
}