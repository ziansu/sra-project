private void throwExceptionIfCancelled(com.ichi2.async.Connection con) {
    if (com.ichi2.async.Connection.getIsCancelled()) {
        timber.log.Timber.i("Sync was cancelled");
        publishProgress(con, R.string.sync_cancelled);
        try {
            mServer.finish(true);
        } catch (com.ichi2.anki.exception.UnknownHttpResponseException e) {
        }
        throw new java.lang.RuntimeException("UserAbortedSync");
    }
}