@java.lang.Override
public org.jenkinsci.plugins.codedx.Action getProjectAction(org.jenkinsci.plugins.codedx.AbstractProject<?, ?> project) {
    java.lang.String latestUrl = null;
    if (((projectId.length()) != 0) && (!(projectId.equals("-1")))) {
        latestUrl = client.buildLatestAnalysisRunUrl(java.lang.Integer.parseInt(projectId));
    }
    return new org.jenkinsci.plugins.codedx.CodeDxProjectAction(project, analysisResultConfiguration, latestUrl);
}