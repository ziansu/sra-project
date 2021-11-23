private org.apache.maven.project.MavenProject readPomFile(java.io.File pom) {
    org.apache.maven.model.Model model = null;
    java.io.FileReader reader = null;
    org.apache.maven.model.io.xpp3.MavenXpp3Reader mavenreader = new org.apache.maven.model.io.xpp3.MavenXpp3Reader();
    try {
        reader = new java.io.FileReader(pom);
    } catch (java.io.FileNotFoundException e1) {
    }
    try {
        model = mavenreader.read(reader);
        model.setPomFile(pom);
    } catch (java.io.IOException | org.codehaus.plexus.util.xml.pull.XmlPullParserException e1) {
    }
    org.apache.maven.project.MavenProject project = new org.apache.maven.project.MavenProject(model);
    return project;
}