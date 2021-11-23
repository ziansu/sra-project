public static edu.cmu.ml.rtw.util.Logger getLogger() {
    if ((java.lang.System.getProperty("log4j.configurationFile")) == null) {
        java.lang.String console = java.lang.System.getProperty("log4j.console");
        if ((console != null) && (console.equals("true")))
            return edu.cmu.ml.rtw.util.LogFactory.getConsoleLogger();
        else
            return edu.cmu.ml.rtw.util.LogFactory.getNullLogger();
        
    }else {
        return edu.cmu.ml.rtw.util.LogFactory.getL4JLogger();
    }
}