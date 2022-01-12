public boolean isSessionOwner(java.lang.String session, java.lang.String pSessionId) {
    java.lang.String skey = org.scg.common.tool.SIDTool.buildWSSessionKey(pSessionId, session);
    if (org.scg.db.DB.JEDIS.exists(skey)) {
        java.lang.String psid = org.scg.db.DB.JEDIS.get(skey);
        if (pSessionId.equals(psid)) {
            return true;
        }
    }
    return false;
}