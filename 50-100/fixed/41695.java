public static boolean logOut(java.util.UUID sId) {
    if (!(org.bgu.domain.facades.UserFacade.sessions.containsKey(sId)))
        return false;
    
    org.bgu.domain.facades.Session session = org.bgu.domain.facades.UserFacade.sessions.get(sId);
    if ((session._member) == null) {
        return false;
    }
    if (!(session._forum.logOut(session._member.getUserName())))
        return false;
    
    return true;
}