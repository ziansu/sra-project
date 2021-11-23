@javax.annotation.PostConstruct
public void init() {
    if ((com.ericsson.eiffel.remrem.generate.cli.CLIOptions.getCommandLine()) == null) {
        com.ericsson.eiffel.remrem.generate.helper.RemremJarHelper.addJarsToClassPath(jarPath);
        lookupForJarFileChanges();
    }else
        if (!(com.ericsson.eiffel.remrem.generate.cli.CLIOptions.getCommandLine().hasOption("jp"))) {
            com.ericsson.eiffel.remrem.generate.helper.RemremJarHelper.addJarsToClassPath(jarPath);
        }
    
}