@java.lang.Override
public boolean perform(hudson.model.AbstractBuild<?, ?> build, hudson.Launcher launcher, hudson.model.BuildListener listener) throws java.io.IOException, java.lang.InterruptedException {
    boolean result = false;
    hudson.util.ArgumentListBuilder cliCommand = composeFlywayCommand(build, listener);
    if (cliCommand != null) {
        int exitStatus = launcher.launch().cmds(cliCommand).stdout(listener).pwd(build.getWorkspace()).join();
        result = didErrorsOccur(build, exitStatus);
    }
    return result;
}