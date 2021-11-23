private io.fabric8.maven.docker.util.MojoParameters buildParameters(java.lang.String projectDir, java.lang.String sourceDir, java.lang.String outputDir) {
    org.apache.maven.project.MavenProject mavenProject = new org.apache.maven.project.MavenProject();
    mavenProject.setFile(new java.io.File(projectDir));
    return new io.fabric8.maven.docker.util.MojoParameters(null, mavenProject, null, null, null, null, sourceDir, outputDir);
}