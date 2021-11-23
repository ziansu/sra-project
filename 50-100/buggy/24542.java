@org.junit.Test
public void atInitAllTemplatesAreAvailables() {
    SpaceInstanciator.xmlPackage = com.silverpeas.admin.spaces.SpaceInstanciatorTest.XMLSPACETEMPLATES_DIR;
    java.util.Map<java.lang.String, com.silverpeas.admin.components.WAComponent> componentModels = new java.util.HashMap<java.lang.String, com.silverpeas.admin.components.WAComponent>();
    com.silverpeas.admin.spaces.SpaceInstanciator instanciator = new com.silverpeas.admin.spaces.SpaceInstanciator(componentModels);
    java.util.Map<java.lang.String, com.silverpeas.admin.spaces.SpaceTemplate> spaceTemplates = instanciator.getAllSpaceTemplates();
    assertNotNull(spaceTemplates);
    assertEquals(1, spaceTemplates.size());
    assertTrue(spaceTemplates.containsKey("EspaceProjet"));
}