@org.junit.Test
public void atInitNoTemplatesDirectoryImpliesNoTemplatesLoaded() {
    SpaceInstanciator.xmlPackage = "toto";
    java.util.Map<java.lang.String, com.silverpeas.admin.components.WAComponent> componentModels = new java.util.HashMap<java.lang.String, com.silverpeas.admin.components.WAComponent>();
    com.silverpeas.admin.spaces.SpaceInstanciator instanciator = new com.silverpeas.admin.spaces.SpaceInstanciator(componentModels);
    java.util.Map<java.lang.String, com.silverpeas.admin.spaces.SpaceTemplate> spaceTemplates = instanciator.getAllSpaceTemplates();
    assertNotNull(spaceTemplates);
    assertTrue(spaceTemplates.isEmpty());
}