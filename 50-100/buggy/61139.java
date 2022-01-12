public void setUserJob(java.lang.String sUserId, java.lang.String sSession, java.lang.String sJobId) {
    for (int i = 0; i < (nl.ru.crpstudio.CrpUtil.userCache.size()); i++) {
        nl.ru.crpstudio.UserSession oThis = nl.ru.crpstudio.CrpUtil.userCache.get(i);
        if ((oThis.userId.equals(sUserId)) && (oThis.sessionId.equals(sSession))) {
            oThis.jobId = sJobId;
            return ;
        }
    }
}