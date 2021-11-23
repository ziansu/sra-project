public java.lang.Integer getSessionId() {
    if (sessions.isEmpty())
        return -1;
    
    com.orientechnologies.orient.client.remote.OStorageRemoteNodeSession curSession = sessions.values().iterator().next();
    return curSession.getSessionId();
}