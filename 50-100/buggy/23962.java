private void log(java.lang.String logString) {
    java.lang.System.out.println(logString);
    if ((logger) != null)
        logger.log((("LambdaLogger" + logString) + "\n"));
    
    if ((com.steeleye.sink.parser.pst.LambdaTest.log4jLogger) != null) {
        com.steeleye.sink.parser.pst.LambdaTest.log4jLogger.debug((("Log4j Debug" + logString) + "\n"));
        com.steeleye.sink.parser.pst.LambdaTest.log4jLogger.error((("Log4j Error" + logString) + "\n"));
    }
}