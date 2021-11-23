public letsmeet.web.MeetResponse joinMeet(java.lang.String sessionID, int meetID) {
    letsmeet.session.Session session = dataAccessObject.findSessionById(sessionID);
    letsmeet.meet.Meet meet = dataAccessObject.getMeetById(meetID);
    if ((session != null) && (meet != null)) {
        boolean result = meet.join(session.getUser());
        int returnCode = letsmeet.helpers.ReturnCodeHelper.OK;
        if (!result) {
            returnCode = letsmeet.helpers.ReturnCodeHelper.NO_ACCESS;
        }
        return new letsmeet.web.MeetResponse(session, meet, returnCode);
    }
    return new letsmeet.web.MeetResponse();
}