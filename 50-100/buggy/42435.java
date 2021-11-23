@java.lang.Override
protected void handle(io.vertx.core.Future<java.lang.Object> future, io.vertx.core.json.JsonObject task) {
    io.vertx.core.json.JsonObject data = task.getJsonObject(DistributedVerticle.JSON_OBJECT);
    try {
        org.genericsystem.cv.comparator.FillModelWithData.saveOcrDataInModel(engine, data);
    } catch (java.lang.RuntimeException e) {
        future.fail(e);
    }
    future.complete();
}