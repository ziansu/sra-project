public io.logz.log4j2.LogzioAppender.Builder setName(java.lang.String name) {
    if (name == null) {
        io.logz.log4j2.LogzioAppender.statusLogger.warn("No name provided for LogzioAppender");
        name = "LogzioAppender";
    }
    this.name = name;
    return this;
}