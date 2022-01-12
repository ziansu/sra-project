public long getRetryAfterInMilliseconds() {
    if ((this.responseHeaders) != null) {
        java.lang.String header = this.responseHeaders.get(HttpConstants.HttpHeaders.RETRY_AFTER_IN_MILLISECONDS);
        if ((header != null) && (!(header.isEmpty()))) {
            long retryIntervalInMilliseconds = java.lang.Long.valueOf(header);
            return retryIntervalInMilliseconds;
        }
    }
    return 0;
}