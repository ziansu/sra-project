@java.lang.Override
public void onHandlerMissing(java.lang.String route) {
    log(event(com.codingchili.core.logging.LOG_HANDLER_MISSING, Level.WARNING).put(com.codingchili.core.logging.LOG_MESSAGE, com.codingchili.core.configuration.CoreStrings.quote(route)));
}