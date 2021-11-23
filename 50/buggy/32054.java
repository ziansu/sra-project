@java.lang.Override
public boolean isTraceEnabled() {
    if ((underlyingLogger) == null) {
        return org.apache.log4j.Logger.getRootLogger().isTraceEnabled();
    }
    return underlyingLogger.isTraceEnabled();
}