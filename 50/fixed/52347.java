public static void disableConsoleLog() {
    if (!(jazmin.log.LoggerFactory.isConsoleLogEnabled)) {
        return ;
    }
    jazmin.log.LoggerFactory.isConsoleLogEnabled = false;
    jazmin.log.LoggerFactory.configFactory.getConfiguration().disableConsoleOutput();
}