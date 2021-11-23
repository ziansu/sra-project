private void addUserProperties(org.metaborg.spoofax.intellij.jps.ant.Project antProject, java.util.Map<java.lang.String, java.lang.String> properties) {
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : properties.entrySet()) {
        antProject.setUserProperty(entry.getKey(), entry.getValue());
    }
}