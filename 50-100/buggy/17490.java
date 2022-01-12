@java.lang.Override
public void run() {
    if (checkUsedAndLock()) {
        boolean lastSession = unlockSession();
        boolean keepChangedFlag = !lastSession;
        boolean commitAttributes = lastSession || (forceCommit);
        if (lastSession && (invalidateOnCommit)) {
            invalidationOnCommit();
        }else {
            storeToRepository(commitAttributes, keepChangedFlag);
        }
        committed();
        dirty = false;
        com.amadeus.session.RepositoryBackedSession.logger.info("Committed session: {}", sessionData);
    }else {
        com.amadeus.session.RepositoryBackedSession.logger.debug("Nothing to commit for session: {}", sessionData);
    }
}