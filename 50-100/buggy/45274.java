@java.lang.Override
protected void mapAndProcess(java.lang.Object eventObject, org.wso2.siddhi.core.stream.input.InputEventHandler inputEventHandler) throws java.lang.InterruptedException {
    synchronized(this) {
        java.lang.Object convertedEvent;
        convertedEvent = convertToEvent(eventObject);
        if (convertedEvent != null) {
            if (convertedEvent instanceof org.wso2.siddhi.core.event.Event[]) {
                inputEventHandler.sendEvents(((org.wso2.siddhi.core.event.Event[]) (convertedEvent)));
            }else {
                inputEventHandler.sendEvent(((org.wso2.siddhi.core.event.Event) (convertedEvent)));
            }
        }
    }
}