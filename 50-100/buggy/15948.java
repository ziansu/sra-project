protected int processEvent(de.uni_hildesheim.sse.monitoring.runtime.recordingStrategies.RecordingStrategiesElement event) {
    int result = event.getIdentification();
    try {
        handleEvent(event);
        event.clear();
        event.release();
    } catch (de.uni_hildesheim.sse.monitoring.runtime.recordingStrategies.AbstractEventRecorderStrategy.HandleException ex) {
        ex.printStackTrace();
        java.lang.System.exit(0);
    }
    return result;
}