public java.lang.String getSessionIdBySeqId(long sessionSequenceId) {
    java.lang.String sessionId = null;
    for (org.ovirt.engine.core.bll.aaa.SessionDataContainer.SessionInfo sessionInfo : sessionInfoMap.values()) {
        if (sessionInfo.contentOfSession.get(org.ovirt.engine.core.bll.aaa.SessionDataContainer.ENGINE_SESSION_SEQ_ID).equals(sessionSequenceId)) {
            sessionId = ((java.lang.String) (sessionInfo.contentOfSession.get(org.ovirt.engine.core.bll.aaa.SessionDataContainer.ENGINE_SESSION_ID)));
            break;
        }
    }
    return sessionId;
}