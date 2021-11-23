@java.lang.Override
public boolean isManaged(org.automagic.deps.doctor.TransitiveDependency dependency) {
    if (((project.getDependencyManagement()) == null) || ((project.getDependencyManagement().getDependencies()) == null)) {
        return false;
    }
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.List<org.apache.maven.model.Dependency> dependencies = project.getDependencyManagement().getDependencies();
    return exists(dependencies, dependency.getArtifact());
}