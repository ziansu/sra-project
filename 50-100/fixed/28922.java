@java.lang.Override
protected void handleResult(io.vertx.core.AsyncResult<java.lang.Object> res, io.vertx.core.json.JsonObject task) {
    if (res.succeeded()) {
        if (!(((io.vertx.core.json.JsonObject) (res.result())).isEmpty()))
            addTask(task.getString(DistributedVerticle.FILENAME), ((io.vertx.core.json.JsonObject) (res.result())), OcrWorkerVerticle.ACTION);
        
    }else
        throw new java.lang.IllegalStateException("Exception in OcrParametersVerticle.", res.cause());
    
}