public void receiveServerMessage(java.lang.String message) {
    try {
        parseAndUpdatePinInput(message);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    try {
        parseAndUpdateTemperature(message);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}