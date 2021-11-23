@java.lang.Override
public void execute() throws org.apache.maven.plugin.MojoExecutionException, org.apache.maven.plugin.MojoFailureException {
    if ((source) == null) {
        throw new org.apache.maven.plugin.MojoFailureException(this, "The source is null", "");
    }
    if ((target) == null) {
        throw new org.apache.maven.plugin.MojoFailureException(this, "The target is null!", ("The target path for the " + "module-fragment.xml is null. Please provide a target path."));
    }
    com.github.zaplatynski.firstspirit.modules.fsm.velocity.ModuleXmlParser parser = new com.github.zaplatynski.firstspirit.modules.fsm.velocity.ModuleXmlParser(source, target, project, getLog());
    parser.parseModuleVm();
}