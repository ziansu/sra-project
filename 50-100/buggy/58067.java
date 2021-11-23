public void severe(java.lang.String toLog) {
    java.lang.String message = (("SEVERE: " + (new java.util.Date().toString())) + ": ") + toLog;
    this.allCache.add(message);
    this.severeRecentCache.add(message);
    this.logger.warning(toLog);
}