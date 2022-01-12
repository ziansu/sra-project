@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Object> mapData() {
    java.util.Map<java.lang.String, java.lang.Object> map = new java.util.HashMap<>();
    map.put(com.memtrip.bounty.generation.model.VertxDataModel.VERTX_VERSION, getRestSchema().getConfiguration().getVertx().getVersion());
    map.putAll(com.memtrip.bounty.generation.method.vertx.GetVertxPathMethod.getMethodMap());
    map.putAll(com.memtrip.bounty.generation.method.vertx.GetVertxResolverMethod.getMethodMap());
    return map;
}