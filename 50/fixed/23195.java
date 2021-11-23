public io.vertx.rxjava.ext.sql.SQLConnection setQueryTimeout(int timeoutInSeconds) {
    delegate.setQueryTimeout(timeoutInSeconds);
    return this;
}