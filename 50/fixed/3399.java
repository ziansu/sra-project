public io.knotx.knot.service.service.ServiceEntry mergeParams(io.vertx.core.json.JsonObject defaultParams) {
    if (defaultParams != null) {
        this.params = defaultParams.copy().mergeIn(this.params);
    }
    return this;
}