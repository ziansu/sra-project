@java.lang.Override
public void log(java.lang.Object out, java.lang.String level) {
    if (com.utilsplus.logging.LoggingConfigurator.isPrinting(level.trim())) {
        com.utilsplus.logging.PLogger.forceLog(out, level, com.utilsplus.logging.PLogger.c);
    }
}