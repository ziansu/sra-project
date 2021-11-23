public void execute(io.vertx.core.Vertx vertx, io.vertx.core.http.HttpServerRequest request) {
    init(vertx, request);
    if (params.isEmpty()) {
        request.response().end("error 남요");
        return ;
    }
    onExecute(0, params);
}