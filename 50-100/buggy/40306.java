private void handleIOError(com.cisco.cta.taxii.adapter.persistence.TaxiiStatus.Feed feed, java.lang.Throwable e) throws java.lang.Exception {
    java.lang.Integer ioErrorCount = feed.getIoErrorCount();
    if (ioErrorCount == null) {
        ioErrorCount = new java.lang.Integer(1);
    }else {
        ioErrorCount = ioErrorCount + 1;
    }
    feed.setIoErrorCount(ioErrorCount);
    taxiiStatusDao.updateOrAdd(feed);
    if (ioErrorCount >= (com.cisco.cta.taxii.adapter.AdapterTask.MAX_HTTP_CONNECTION_ATTEMPTS)) {
        throw new java.lang.Exception("Exceeded maximum number of HTTP connection retries", e);
    }else {
        com.cisco.cta.taxii.adapter.AdapterTask.LOG.warn("HTTP connection problem occured.");
    }
}