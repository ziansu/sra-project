@java.lang.Deprecated
public void setParameters(java.lang.String parameters) {
    parameters = hudson.Util.fixEmptyAndTrim(parameters);
    setBuildFilter((parameters != null ? new hudson.plugins.copyartifact.ParametersBuildFilter(parameters) : null));
}