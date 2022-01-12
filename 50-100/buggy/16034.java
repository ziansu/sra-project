private void resetMavenSettings() {
    if ((org.jboss.forge.arquillian.FurnaceDeployableContainer.originalUserSettings) != null)
        java.lang.System.setProperty(MavenContainer.ALT_USER_SETTINGS_XML_LOCATION, org.jboss.forge.arquillian.FurnaceDeployableContainer.originalUserSettings);
    else
        java.lang.System.clearProperty(MavenContainer.ALT_USER_SETTINGS_XML_LOCATION);
    
    if ((org.jboss.forge.arquillian.FurnaceDeployableContainer.originalLocalRepository) != null)
        java.lang.System.setProperty(MavenContainer.ALT_LOCAL_REPOSITORY_LOCATION, org.jboss.forge.arquillian.FurnaceDeployableContainer.originalLocalRepository);
    else
        java.lang.System.clearProperty(MavenContainer.ALT_LOCAL_REPOSITORY_LOCATION);
    
    if ((org.jboss.forge.arquillian.FurnaceDeployableContainer.originalLocalRepository) != null)
        java.lang.System.setProperty(MavenContainer.ALT_GLOBAL_SETTINGS_XML_LOCATION, org.jboss.forge.arquillian.FurnaceDeployableContainer.originalGlobalSettings);
    else
        java.lang.System.clearProperty(MavenContainer.ALT_GLOBAL_SETTINGS_XML_LOCATION);
    
}