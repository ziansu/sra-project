private void init(java.lang.String messagePattern, int argCount, java.lang.Object[] paramArray) {
    this.varargs = null;
    this.buffer.setLength(0);
    this.messagePattern = messagePattern;
    this.argCount = argCount;
    int usedCount = org.apache.logging.log4j.message.ParameterFormatter.countArgumentPlaceholders(messagePattern);
    initThrowable(paramArray, usedCount);
}