private java.lang.Double getProtocolVersionDouble() {
    synchronized(mInitializationLock) {
        if ((mProtocolVersionDouble) == null) {
            try {
                init();
            } catch (java.lang.Exception e) {
                timber.log.Timber.e("Exception encountered while initializing EasStore", e);
            }
        }
        return mProtocolVersionDouble;
    }
}