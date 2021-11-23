public static void doNotPrint(com.utilsplus.logging.model.Level... level) {
    for (com.utilsplus.logging.model.Level doPrint : level) {
        if ((com.utilsplus.logging.LoggingConfigurator.outputProps.getProperty(("" + doPrint), "missing")) != "missing") {
        }else {
            com.utilsplus.logging.LoggingConfigurator.outputProps.setProperty(("" + doPrint), com.utilsplus.logging.LoggingConfigurator.FALSE_STRING);
        }
    }
}