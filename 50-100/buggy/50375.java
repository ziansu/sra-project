private boolean isEmptyArrayElement(org.openlca.app.cloud.ui.compare.JsonNode node) {
    com.google.gson.JsonElement element = (local) ? node.getLocalElement() : node.getRemoteElement();
    if (element != null)
        return false;
    
    if ((node.parent.getElement()) != null)
        return node.parent.getElement().isJsonArray();
    
    return false;
}