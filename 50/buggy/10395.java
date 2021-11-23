public synchronized java.lang.String dequeueGrog() {
    java.lang.String str = null;
    if (grogAvailable) {
        str = arduinoMessages.remove();
        if (arduinoMessages.isEmpty()) {
            grogAvailable = false;
            state = protocol.ServerProtocolParser.VACANT;
        }
    }
    return str;
}