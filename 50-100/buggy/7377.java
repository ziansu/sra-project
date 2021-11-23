private boolean hasKeepAliveForConnection() {
    java.lang.String keepAlive = assertion.getKeepAlive();
    if (gov.hhs.fha.nhinc.nhinclib.NullChecker.isNullish(keepAlive)) {
        keepAlive = getKeepAliveProperty();
    }
    return (gov.hhs.fha.nhinc.nhinclib.NullChecker.isNotNullish(keepAlive)) && ((keepAlive.equalsIgnoreCase("TRUE")) || (keepAlive.equalsIgnoreCase("T")));
}