public void reject(final java.lang.Exception err) throws java.lang.Exception {
    synchronized(this) {
        if ((mState) == (co.tinode.tinodesdk.PromisedReply.State.WAITING)) {
            mState = co.tinode.tinodesdk.PromisedReply.State.REJECTED;
            mException = err;
            callOnFailure(err);
            mDoneSignal.countDown();
        }else {
            throw new java.lang.IllegalStateException("Promise is already completed");
        }
    }
}