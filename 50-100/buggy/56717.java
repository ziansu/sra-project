@java.lang.Override
public void formatTo(final java.lang.StringBuilder buffer) {
    if (isThreadLocalMessageInitialized) {
        final java.lang.StringBuilder msg = org.apache.logging.log4j.message.ParameterizedMessage.threadLocalStringBuilder.get();
        if (msg != buffer) {
            buffer.append(msg);
        }
        return ;
    }
    final java.lang.Throwable t = org.apache.logging.log4j.message.ParameterizedMessage.formatMessage(buffer, messagePattern, getParameters(), argCount, throwable);
    initThrowable(t);
    clearUnrolledArgs();
}