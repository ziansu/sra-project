@java.lang.Override
public hudson.scm.PollingResult compareRemoteRevisionWith(hudson.model.Job<?, ?> project, hudson.Launcher launcher, hudson.FilePath workspace, hudson.model.TaskListener listener, hudson.scm.SCMRevisionState baseline) throws java.io.IOException, java.lang.InterruptedException {
    if (poll(((hudson.model.AbstractProject) (project)), launcher, workspace, listener)) {
        return hudson.scm.PollingResult.SIGNIFICANT;
    }else {
        return hudson.scm.PollingResult.NO_CHANGES;
    }
}