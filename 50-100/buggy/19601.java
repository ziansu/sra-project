public void setUserOkay(java.lang.String sUserId, java.lang.String sSession) {
    for (int i = 0; i < (nl.ru.crpstudio.CrpUtil.userCache.size()); i++) {
        nl.ru.crpstudio.UserSession oThis = nl.ru.crpstudio.CrpUtil.userCache.get(i);
        if ((oThis.userId.equals(sUserId)) && (oThis.sessionId.equals(sSession))) {
            oThis.userOkay = true;
            return ;
        }
    }
    addUserSession(sUserId, sSession);
}