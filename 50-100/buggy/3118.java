private java.util.List<org.apache.sling.commons.json.JSONObject> collectTree(org.apache.sling.commons.json.JSONObject item) throws org.apache.sling.commons.json.JSONException {
    java.util.List<org.apache.sling.commons.json.JSONObject> items = new java.util.ArrayList<>();
    for (org.apache.sling.commons.json.JSONObject child : getChildren(item).values()) {
        items.add(child);
        items.addAll(collectTree(child));
    }
    return items;
}