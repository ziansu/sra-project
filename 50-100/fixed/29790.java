@java.lang.Override
public void handleEvent(org.matsim.contrib.signals.events.SignalGroupStateChangedEvent event) {
    if (SignalGroupState.GREEN.equals(event.getNewState())) {
        this.checkAndHandleGreenAllowed(event);
    }else
        if (SignalGroupState.RED.equals(event.getNewState())) {
            this.handleRedOrSimilarStateChange(event);
        }else
            if (SignalGroupState.OFF.equals(event.getNewState())) {
                this.handleRedOrSimilarStateChange(event);
            }
        
    
}