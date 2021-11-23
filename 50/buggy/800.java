public org.slf4j.Logger getLogger(java.lang.String name) {
    loggerNameList.add(name);
    return NOPLogger.NOP_LOGGER;
}