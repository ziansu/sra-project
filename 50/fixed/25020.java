public java.lang.String getHost() {
    if (debug) {
        return this.debugHost;
    }else {
        return WhispirSDKConstants.API_HOST;
    }
}