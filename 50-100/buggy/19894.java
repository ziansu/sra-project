@java.lang.Override
public boolean perform(hudson.model.AbstractBuild<?, ?> build, hudson.Launcher launcher, hudson.model.BuildListener listener) throws java.io.IOException, java.lang.InterruptedException {
    hudson.util.ArgumentListBuilder cliCommand = composeFlywayCommand(build, listener);
    int exitStatus = launcher.launch().cmds(cliCommand).stdout(listener).pwd(build.getWorkspace()).join();
    boolean result = didErrorsOccur(build, exitStatus);
    return result;
}