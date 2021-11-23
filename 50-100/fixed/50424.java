private void streamActivityDetected(java.lang.String str) {
    if (!(state.exists(State.values.streamactivityenabled)))
        return ;
    
    if ((java.lang.System.currentTimeMillis()) > ((state.getLong(State.values.streamactivityenabled)) + 5000.0)) {
        messageplayer(("streamactivity: " + str), "streamactivity", str);
        setStreamActivityThreshold("0 0");
        state.set(State.values.streamactivity, str);
    }
}