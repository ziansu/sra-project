public org.apache.openmeetings.db.entity.user.User loginUserByRemoteHash(java.lang.String SID, java.lang.String remoteHash) {
    try {
        org.apache.openmeetings.db.entity.server.Sessiondata sessionData = sessionDao.get(remoteHash);
        if (sessionData != null) {
            org.apache.openmeetings.db.entity.user.User u = userDao.get(sessionData.getUserId());
            sessionDao.updateUserWithoutSession(SID, u.getId());
            return u;
        }
    } catch (java.lang.Exception ex2) {
        org.apache.openmeetings.service.user.UserManager.log.error("[loginUserByRemoteHash]: ", ex2);
    }
    return null;
}