@java.lang.Override
public void changed(com.couchbase.lite.replicator.Replication.ChangeEvent event) {
    java.lang.Throwable error = null;
    if ((mPull) != null) {
        if (error == null)
            error = mPull.getLastError();
        
    }
    if ((error == null) || (error == (mReplError)))
        error = mPush.getLastError();
    
    if (error != (mReplError)) {
        mReplError = error;
        showErrorMessage(mReplError.getMessage(), null);
    }
}