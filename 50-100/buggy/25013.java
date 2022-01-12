@java.lang.SuppressWarnings(value = "rawtypes")
private int getBuildNumberFromUpStreamProject(java.lang.String projectName, java.util.Map<hudson.model.AbstractProject, java.lang.Integer> map, hudson.model.BuildListener listener) {
    for (java.util.Map.Entry<hudson.model.AbstractProject, java.lang.Integer> project : map.entrySet()) {
        if (project.getKey().equals(projectName)) {
            return project.getValue();
        }
    }
    listener.error(java.text.MessageFormat.format(hudson.plugins.sctmexecutor.Messages.getString("SCTMExecutor.err.notAUpstreamJob"), projectName));
    return -1;
}