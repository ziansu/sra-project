public static synchronized void setLimitTracking(boolean limitTracking) {
    com.commutestream.sdk.CommuteStream.request.setLimitTracking(limitTracking);
    if (com.commutestream.sdk.CommuteStream.isInitialized()) {
        com.commutestream.sdk.CommuteStream.doPending();
    }
}