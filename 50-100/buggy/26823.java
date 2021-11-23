void reCompute() {
    mRecomputing = true;
    try {
        while ((mInvalidated) && (!(mStopped))) {
            try {
                compute();
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        } 
    } finally {
        mRecomputing = false;
    }
}