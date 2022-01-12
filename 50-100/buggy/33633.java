public static session.Session genSession(boolean incr) {
    java.lang.String newSessionID = null;
    newSessionID = ((((servelet.SessionServelet.servID) + (servelet.SessionServelet.SESSIONID_SPLITTER)) + (servelet.SessionServelet.rebootNum)) + (servelet.SessionServelet.SESSIONID_SPLITTER)) + (servelet.SessionServelet.sessNum);
    if (incr)
        (servelet.SessionServelet.sessNum)++;
    
    return new session.Session(newSessionID);
}