public final java.lang.String toJsonString(boolean pretty) {
    configGroup.sort();
    java.lang.String s = latmod.lib.config.LMJsonUtils.toJson(latmod.lib.config.LMJsonUtils.getGson(pretty), configGroup);
    return s;
}