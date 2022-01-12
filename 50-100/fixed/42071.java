public void addSession(org.jivesoftware.openfire.session.LocalClientSession session) {
    routingTable.addClientRoute(session.getAddress(), session);
    localSessionManager.getPreAuthenticatedSessions().remove(session.getStreamID().toString());
    org.jivesoftware.openfire.event.SessionEventDispatcher.EventType event = (session.getAuthToken().isAnonymous()) ? SessionEventDispatcher.EventType.anonymous_session_created : SessionEventDispatcher.EventType.session_created;
    org.jivesoftware.openfire.event.SessionEventDispatcher.dispatchEvent(session, event);
    if (org.jivesoftware.openfire.cluster.ClusterManager.isClusteringStarted()) {
        sessionInfoCache.put(session.getAddress().toString(), new org.jivesoftware.openfire.session.ClientSessionInfo(session));
    }
}