public final java.lang.String toJsonString(boolean pretty) {
    return latmod.lib.config.LMJsonUtils.toJson(latmod.lib.config.LMJsonUtils.getGson(pretty), configGroup);
}