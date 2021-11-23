@java.lang.Override
public void append(org.apache.logging.log4j.core.LogEvent logEvent) {
    if (com.getsentry.raven.environment.RavenEnvironment.isManagingThread())
        return ;
    
    com.getsentry.raven.environment.RavenEnvironment.startManagingThread();
    try {
        if ((raven) == null)
            initRaven();
        
        com.getsentry.raven.event.Event event = buildEvent(logEvent);
        raven.sendEvent(event);
    } catch (java.lang.Exception e) {
        error("An exception occurred while creating a new event in Raven", logEvent, e);
    } finally {
        com.getsentry.raven.environment.RavenEnvironment.stopManagingThread();
    }
}