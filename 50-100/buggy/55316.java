@java.lang.Override
public boolean performImpl(hudson.model.AbstractBuild<?, ?> build, hudson.Launcher launcher, hudson.model.BuildListener listener) throws java.lang.Exception {
    java.io.PrintStream logger = listener.getLogger();
    com.hp.sv.jsvconfigurator.core.IProject project = loadProject();
    printProjectContent(project, logger);
    deployServiceFromProject(project, logger);
    return true;
}