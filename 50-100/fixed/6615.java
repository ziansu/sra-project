private long checkQueryTimeout() {
    long timeLeft = timeoutAt - (java.lang.System.currentTimeMillis());
    if (timeLeft <= 0) {
        java.lang.String msg = io.druid.common.utils.StringUtils.safeFormat("Query[%s] url[%s] timed out.", query.getId(), url);
        setupResponseReadFailure(msg, null);
        throw new io.druid.java.util.common.RE(msg);
    }else {
        return timeLeft;
    }
}