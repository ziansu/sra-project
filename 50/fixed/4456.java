public void execute(io.vertx.core.Vertx vertx, io.vertx.core.http.HttpServerRequest request) {
    init(vertx, request);
    onExecute(0, params);
}