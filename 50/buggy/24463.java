public long getConnectionTimeout() {
    return ((long) (params.getIntParameter(CoreConnectionPNames.SO_TIMEOUT, 0)));
}