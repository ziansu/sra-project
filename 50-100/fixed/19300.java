protected static void logOutput(io.fabric8.updatebot.Configuration configuration, org.slf4j.Logger log, java.lang.String output, boolean error) {
    if (io.fabric8.utils.Strings.notEmpty(output)) {
        java.lang.String[] lines = output.split("\n");
        for (java.lang.String line : lines) {
            if (error) {
                configuration.info(log, line);
            }else {
                configuration.error(log, line);
            }
        }
    }
}