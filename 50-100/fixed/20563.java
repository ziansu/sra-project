@java.lang.Override
public void log(java.lang.String log, org.sonarsource.scanner.maven.bootstrap.Level level) {
    switch (level) {
        case TRACE :
        case DEBUG :
            mavenLog.debug(log);
            break;
        case WARN :
            mavenLog.warn(log);
            break;
        case ERROR :
            mavenLog.error(log);
            break;
        case INFO :
        default :
            mavenLog.info(log);
            break;
    }
}