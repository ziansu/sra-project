public void logInfo(java.lang.String s, java.lang.Object... params) {
    logger.info(((MQ7PREFIX) + (java.text.MessageFormat.format(s, params))));
}