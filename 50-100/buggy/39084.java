@java.lang.Override
public void run() {
    try {
        lastStarted = new java.util.Date();
        if (commands.isEmpty())
            return ;
        
        preRun();
        scheduler.run();
    } catch (java.lang.Throwable t) {
        logger.error(("araqne logdb: query failed - " + (this)), t);
        stop(t);
    }
}