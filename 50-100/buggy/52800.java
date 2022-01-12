@java.lang.Override
public org.jenkinsci.plugins.codedx.Action getProjectAction(org.jenkinsci.plugins.codedx.AbstractProject<?, ?> project) {
    org.jenkinsci.plugins.codedx.CodeDxClient client = new org.jenkinsci.plugins.codedx.CodeDxClient(url, key);
    java.lang.String latestUrl = null;
    if (((projectId.length()) != 0) && (!(projectId.equals("-1")))) {
        latestUrl = client.buildLatestAnalysisRunUrl(java.lang.Integer.parseInt(projectId));
    }
    return new org.jenkinsci.plugins.codedx.CodeDxProjectAction(project, analysisResultConfiguration, latestUrl);
}