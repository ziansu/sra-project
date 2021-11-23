public web.ReturnCodeResponse deleteUser(java.lang.String sessionID) {
    session.Session session = dataAccessObject.findSessionById(sessionID);
    if (session != null) {
        dataAccessObject.delete(session.getUser());
        session.setHasEnded(true);
        return new web.ReturnCodeResponse(helpers.ReturnCodeHelper.OK);
    }
    return new web.ReturnCodeResponse();
}