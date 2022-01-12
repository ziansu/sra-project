public void log(com.site.maven.plugin.codegen.LogLevel logLevel, java.lang.String message) {
    switch (logLevel) {
        case DEBUG :
            if (debug) {
                getLog().debug(message);
            }
            break;
        case INFO :
            if ((debug) || (verbose)) {
                getLog().info(message);
            }
            break;
        case ERROR :
            getLog().error(message);
            break;
    }
}