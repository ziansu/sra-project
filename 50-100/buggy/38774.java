protected java.util.Map<java.lang.String, java.lang.String> getConfig(io.vertx.core.json.JsonObject obj, java.lang.String prefix) {
    java.util.Map<java.lang.String, java.lang.String> mfp = getConfigMapFromProperties(("apiman-gateway." + prefix));
    if ((mfp != null) && (!(mfp.isEmpty()))) {
        return mfp;
    }else
        if (obj == null) {
            return java.util.Collections.emptyMap();
        }
    
    return toFlatStringMap(obj.getJsonObject(prefix).getJsonObject(io.apiman.gateway.platforms.vertx3.common.config.VertxEngineConfig.GATEWAY_CONFIG));
}