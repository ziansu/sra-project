protected java.lang.String getJavaVersion() {
    java.lang.String javaVersion = "1.7";
    org.apache.maven.model.Plugin p = maven_project.getPlugin("org.apache.maven.plugins:maven-compiler-plugin");
    if (p != null) {
        org.codehaus.plexus.util.xml.Xpp3Dom config = ((org.codehaus.plexus.util.xml.Xpp3Dom) (p.getConfiguration()));
        org.codehaus.plexus.util.xml.Xpp3Dom domVersion = config.getChild("target");
        if (domVersion != null) {
            javaVersion = domVersion.getValue();
        }
    }
    return javaVersion;
}