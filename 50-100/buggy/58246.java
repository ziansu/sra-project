public final void endDocument() {
    isParsing = false;
    if ((configuration.Configuration.internal_event_threads) > 1)
        internalEventThreadPool.join(Configuration.internal_event_threads);
    
    if ((configuration.Configuration.satisfied_position_record_threads) > 1)
        satisfiedPositionRecordThreadPool.join(Configuration.satisfied_position_record_threads);
    
    if ((configuration.Configuration.approach) == 2) {
        java.lang.System.out.println(("FILTER - internal event ID: " + (internalEventID)));
        hybridThread.mainRun();
    }
}