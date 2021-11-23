void reCompute() {
    mRecomputing = true;
    try {
        while ((mInvalidated) && (!(mStopped))) {
            try {
                compute();
            } catch (java.lang.Exception e) {
                throw e;
            }
        } 
    } finally {
        mRecomputing = false;
    }
}