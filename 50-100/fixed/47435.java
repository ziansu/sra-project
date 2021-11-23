@org.junit.Test
public void testAddDuplicatedTemplate() {
    org.keycloak.representations.idm.ClientTemplateRepresentation templateRep = new org.keycloak.representations.idm.ClientTemplateRepresentation();
    templateRep.setName("template1");
    java.lang.String templateId = createTemplate(templateRep);
    templateRep = new org.keycloak.representations.idm.ClientTemplateRepresentation();
    templateRep.setName("template1");
    javax.ws.rs.core.Response response = clientTemplates().create(templateRep);
    assertEquals(409, response.getStatus());
    org.keycloak.representations.idm.ErrorRepresentation error = response.readEntity(org.keycloak.representations.idm.ErrorRepresentation.class);
    org.junit.Assert.assertEquals("Client Template template1 already exists", error.getErrorMessage());
    removeTemplate(templateId);
}