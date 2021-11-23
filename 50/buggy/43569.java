public void logout(int userId) throws org.pi.litepost.databaseAccess.DatabaseCriticalErrorException {
    model.getSessionManager().endSession();
}