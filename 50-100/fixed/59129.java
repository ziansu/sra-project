public void createInitialStreams() {
    synchronized(streamsToRemainLive) {
        for (java.lang.String streamNameAndAppInstance : streamsToRemainLive) {
            java.lang.String[] streamNameAndAppInstanceArr = extractStreamNameAndAppInstance(streamNameAndAppInstance);
            java.lang.String appInstanceName = streamNameAndAppInstanceArr[1];
            java.lang.String streamName = streamNameAndAppInstanceArr[0];
            if (appInstance.getName().equals(appInstanceName)) {
                broadcastStream(streamName, true);
            }
        }
    }
}