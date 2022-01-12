@java.lang.Override
public void execute() throws org.apache.maven.plugin.MojoExecutionException, org.apache.maven.plugin.MojoFailureException {
    try {
        java.lang.String module = java.lang.System.getProperty("module");
        module = (org.apache.commons.lang3.StringUtils.isBlank(module)) ? prompter.prompt(com.tzg.plugin.module.goal.ModuleRemove.PROMPT) : module;
        while (org.apache.commons.lang3.StringUtils.isBlank(module)) {
            module = prompter.prompt(com.tzg.plugin.module.goal.ModuleRemove.PROMPT);
        } 
        removeFiles(com.tzg.plugin.module.support.ModuleSupport.getModulePath());
        removeFiles(com.tzg.plugin.module.support.ModuleSupport.getMapperPath());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}