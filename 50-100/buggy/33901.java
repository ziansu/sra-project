public final com.google.gson.JsonElement getJson() {
    com.google.gson.JsonObject o = new com.google.gson.JsonObject();
    for (latmod.lib.config.ConfigEntry e : entries.values()) {
        if (!(e.isExcluded())) {
            e.onPreLoaded();
            o.add(e.ID, e.getJson());
        }
    }
    return o;
}