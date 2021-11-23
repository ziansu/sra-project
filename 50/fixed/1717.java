private java.lang.Double getProtocolVersionDouble() {
    synchronized(mInitializationLock) {
        if ((mProtocolVersionDouble) == null) {
            try {
                init();
            } catch (java.lang.Exception e) {
                timber.log.Timber.e(e, "Exception encountered while initializing EasStore");
            }
        }
        return mProtocolVersionDouble;
    }
}