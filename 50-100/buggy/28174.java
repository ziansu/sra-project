public io.vertx.rxjava.ext.sql.SQLConnection rollback(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
    delegate.rollback(new io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>>() {
        public void handle(io.vertx.core.AsyncResult<java.lang.Void> ar) {
            if (ar.succeeded()) {
                handler.handle(io.vertx.core.Future.succeededFuture(ar.result()));
            }else {
                handler.handle(io.vertx.core.Future.failedFuture(ar.cause()));
            }
        }
    });
    return this;
}