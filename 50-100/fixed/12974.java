public org.apache.shiro.session.Session toSimpleSession() throws java.io.IOException {
    final org.apache.shiro.session.mgt.SimpleSession simpleSession = new org.apache.shiro.session.mgt.SimpleSession();
    if ((recordId) != null) {
        simpleSession.setId(recordId.toString());
    }
    simpleSession.setStartTimestamp(startTimestamp.toDate());
    simpleSession.setLastAccessTime(lastAccessTime.toDate());
    simpleSession.setTimeout(timeout);
    simpleSession.setHost(host);
    final java.util.Map attributes = serializer.deserialize(sessionData);
    simpleSession.setAttributes(attributes);
    return simpleSession;
}