private org.apache.maven.project.MavenProject readPomFile(java.io.File pom) {
    org.apache.maven.model.Model model = null;
    org.apache.maven.model.io.xpp3.MavenXpp3Reader mavenreader = new org.apache.maven.model.io.xpp3.MavenXpp3Reader();
    try (java.io.FileReader reader = new java.io.FileReader(pom)) {
        model = mavenreader.read(reader);
        model.setPomFile(pom);
        org.apache.maven.project.MavenProject project = new org.apache.maven.project.MavenProject(model);
        return project;
    } catch (java.io.IOException | org.codehaus.plexus.util.xml.pull.XmlPullParserException e1) {
        return null;
    }
}