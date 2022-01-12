private boolean projectHasItestsDependency() {
    java.util.List<org.apache.maven.model.Dependency> deps = project.getDependencies();
    boolean containsItests = false;
    java.util.Iterator i = deps.iterator();
    while ((i.hasNext()) && (!containsItests)) {
        org.apache.maven.model.Dependency d = ((org.apache.maven.model.Dependency) (i.next()));
        containsItests |= (d.getArtifactId().equals("itests")) && (d.getGroupId().equals("org.universAAL.support"));
    } 
    return containsItests;
}