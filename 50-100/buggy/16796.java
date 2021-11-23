@java.lang.Override
public void exportIfValid(final org.vertx.java.core.Handler<org.vertx.java.core.json.JsonObject> handler) {
    if (isValid()) {
        exportFiles(new org.vertx.java.core.Handler<org.vertx.java.core.AsyncResult<java.lang.String>>() {
            @java.lang.Override
            public void handle(org.vertx.java.core.AsyncResult<java.lang.String> event) {
                if (event.failed()) {
                    addError(event.cause().getMessage());
                }
                handler.handle(result);
            }
        });
    }
}