public void logout() throws org.pi.litepost.databaseAccess.DatabaseCriticalErrorException {
    model.getSessionManager().endSession();
}