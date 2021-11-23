@java.lang.Override
public boolean canHandle(com.intellij.openapi.diagnostic.IdeaLoggingEvent event) {
    return com.intellij.diagnostic.DefaultIdeaErrorLogger.ourLoggerBroken = true;
}