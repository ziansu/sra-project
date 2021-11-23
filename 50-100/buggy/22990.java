protected void writeToLog(org.apache.commons.logging.Log logger, java.lang.String message, java.lang.Throwable ex) {
    if (ex != null) {
        logger.error(ex);
    }else
        if (message.contains("ENTER")) {
            logger.info(message);
        }else
            if (message.contains("EXIT")) {
                logger.debug(message);
            }
        
    
}