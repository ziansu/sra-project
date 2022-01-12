public void resolve(final T result) throws java.lang.Exception {
    synchronized(this) {
        if ((mState) == (co.tinode.tinodesdk.PromisedReply.State.WAITING)) {
            mState = co.tinode.tinodesdk.PromisedReply.State.RESOLVED;
            mResult = result;
            callOnSuccess(result);
            mDoneSignal.countDown();
        }else {
            throw new java.lang.IllegalStateException("Promise is already completed");
        }
    }
}