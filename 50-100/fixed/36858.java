@java.lang.Override
public boolean performImpl(hudson.model.AbstractBuild<?, ?> build, hudson.Launcher launcher, hudson.model.BuildListener listener) throws java.lang.Exception {
    java.io.PrintStream logger = listener.getLogger();
    com.hp.sv.jsvconfigurator.serverclient.ICommandExecutor exec = createCommandExecutor();
    for (com.hp.application.automation.tools.run.ServiceInfo service : getServiceList(false, logger, build)) {
        changeServiceMode(service, logger, exec);
    }
    return true;
}