@java.lang.Override
public boolean isManaged(org.automagic.deps.doctor.TransitiveDependency dependency) {
    if (((project.getDependencyManagement()) == null) || ((project.getDependencyManagement().getDependencies()) == null)) {
        return false;
    }
    return exists(project.getDependencyManagement().getDependencies(), dependency.getArtifact());
}