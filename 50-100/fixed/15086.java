private java.util.Map<java.lang.String, java.lang.String> getPropertiesVariables(hudson.plugins.msbuild.AbstractBuild build) {
    java.util.Map<java.lang.String, java.lang.String> buildVariables = build.getBuildVariables();
    final java.util.Set<java.lang.String> sensitiveBuildVariables = build.getSensitiveBuildVariables();
    if ((sensitiveBuildVariables == null) || (sensitiveBuildVariables.isEmpty())) {
        return buildVariables;
    }
    for (java.lang.String sensitiveBuildVariable : sensitiveBuildVariables) {
        buildVariables.remove(sensitiveBuildVariable);
    }
    return buildVariables;
}