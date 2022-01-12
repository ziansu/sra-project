protected java.lang.Object writeReplace() {
    return new org.apache.logging.log4j.core.impl.Log4jLogEvent.LogEventProxy(this, this.includeLocation);
}