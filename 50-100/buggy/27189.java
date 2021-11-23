@javax.annotation.PostConstruct
public void init() {
    if ((com.ericsson.eiffel.remrem.generate.cli.CLIOptions.getCommandLine()) == null) {
        java.lang.System.out.println(("Adding the jars present in " + (jarPath)));
        com.ericsson.eiffel.remrem.generate.helper.RemremJarHelper.addJarsToClassPath(jarPath);
        lookupForJarFileChanges();
    }else
        if (!(com.ericsson.eiffel.remrem.generate.cli.CLIOptions.getCommandLine().hasOption("jp"))) {
            java.lang.System.out.println(("Adding the jars present in " + (jarPath)));
            com.ericsson.eiffel.remrem.generate.helper.RemremJarHelper.addJarsToClassPath(jarPath);
        }
    
}