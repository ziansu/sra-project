@java.lang.Override
public void initialiseForNewTemplate() {
    if (uk.gov.nationalarchives.droid.results.handlers.JDBCBatchResultHandlerDao.getIsFreshTemplate()) {
        log.error(("Cannot initialise the JDBCBatchResultHandlerDao because it is still in fresh template mode and " + "the format reference data has not yet been populated"));
        return ;
    }
    synchronized(uk.gov.nationalarchives.droid.results.handlers.JDBCBatchResultHandlerDao.LOCKER) {
        boolean alreadyInitialised = ((this.formats) != null) && ((this.formats.size()) > 0);
        if (!alreadyInitialised) {
            setUpFormatsAndDatabaseWriter();
        }
    }
}