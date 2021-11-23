public void debug(org.apache.log4j.Logger logger, java.lang.String text) {
    if (getDebug())
        messenger.writeMsg(logger.getName(), "DEBUG", "", text, null);
    
    logger.debug(text);
}