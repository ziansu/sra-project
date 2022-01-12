protected void removeDependent(io.leao.codecolors.plugin.res.CcConfiguration configuration, io.leao.codecolors.plugin.res.Resource dependent) {
    if ((mConfigurationDependents) != null) {
        java.util.Set<io.leao.codecolors.plugin.res.Resource> dependents = mConfigurationDependents.get(configuration);
        if (dependents != null) {
            dependents.remove(dependent);
        }
    }
}