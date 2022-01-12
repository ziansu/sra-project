public void issueGet() {
    if (isDestroyed)
        throw new java.lang.RuntimeException("pvaClientGet was destroyed");
    
    if ((connectState) == (org.epics.pvaClient.PvaClientGet.GetConnectState.connectIdle))
        connect();
    
    if ((getState) == (org.epics.pvaClient.PvaClientGet.GetState.getActive)) {
        java.lang.String message = ("channel " + (channel.getChannelName())) + " PvaClientGet::issueGet get aleady active ";
        throw new java.lang.RuntimeException(message);
    }
    getState = org.epics.pvaClient.PvaClientGet.GetState.getActive;
    channelGet.get();
}