public void setRunning(java.lang.Boolean newState) {
    isRunning = newState;
    if (((isRunning) == false) && (googleApiClient.isConnected())) {
        googleApiClient.disconnect();
    }else {
        initialise();
        run();
    }
}