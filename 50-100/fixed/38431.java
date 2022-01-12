public web.ReturnCodeResponse deleteUser(java.lang.String sessionID) {
    session.Session session = dataAccessObject.findSessionById(sessionID);
    if (session != null) {
        session.setHasEnded(true);
        dataAccessObject.delete(session.getUser());
        return new web.ReturnCodeResponse(helpers.ReturnCodeHelper.OK);
    }
    return new web.ReturnCodeResponse();
}