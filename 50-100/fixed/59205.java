private void init(java.lang.String messagePattern, int argCount, java.lang.Object[] paramArray) {
    this.varargs = null;
    this.messagePattern = messagePattern;
    this.argCount = argCount;
    int usedCount = org.apache.logging.log4j.message.ParameterFormatter.countArgumentPlaceholders(messagePattern);
    initThrowable(paramArray, usedCount);
}