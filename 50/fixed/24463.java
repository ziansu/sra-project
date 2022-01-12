public long getConnectionTimeout() {
    if ((params) == null) {
        return 0;
    }
    return ((long) (params.getIntParameter(CoreConnectionPNames.SO_TIMEOUT, 0)));
}