private boolean projectHasItestsDependency() {
    java.util.List<org.apache.maven.model.Dependency> deps = project.getDependencies();
    boolean containsItests = false;
    while ((deps.iterator().hasNext()) && (!containsItests)) {
        org.apache.maven.model.Dependency d = ((org.apache.maven.model.Dependency) (deps.iterator().next()));
        containsItests |= (d.getArtifactId().equals("itests")) && (d.getGroupId().equals("org.universAAL.support"));
    } 
    return containsItests;
}