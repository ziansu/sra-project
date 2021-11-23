private void init(java.lang.String messagePattern) {
    this.messagePattern = messagePattern;
    this.indices = new int[messagePattern == null ? 0 : (messagePattern.length()) >> 1];
    int usedCount = org.apache.logging.log4j.message.ParameterFormatter.countArgumentPlaceholders2(messagePattern, indices);
    initThrowable(argArray, usedCount);
    this.usedCount = java.lang.Math.min(usedCount, ((argArray) == null ? 0 : argArray.length));
}