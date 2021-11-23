private com.google.gson.JsonObject getConnectionsJson(siteClasses.LastfmNode node) throws java.lang.Exception {
    if (node == null)
        return null;
    
    return getInfoJson(node.getName(), node.getMbid());
}