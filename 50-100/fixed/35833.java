public com.parrot.arsdk.ardiscovery.ARDISCOVERY_ERROR_ENUM dispose() {
    com.parrot.arsdk.ardiscovery.ARDISCOVERY_ERROR_ENUM error = ARDISCOVERY_ERROR_ENUM.ARDISCOVERY_OK;
    synchronized(this) {
        if ((initOk) == true) {
            int nativeError = nativeDelete(nativeARDiscoveryConnection);
            error = com.parrot.arsdk.ardiscovery.ARDISCOVERY_ERROR_ENUM.getFromValue(nativeError);
            if (error == (ARDISCOVERY_ERROR_ENUM.ARDISCOVERY_OK)) {
                nativeARDiscoveryConnection = 0;
                initOk = false;
            }
        }
    }
    return error;
}