public void postSelectedItems(com.melodies.bandup.setup.DoubleListAdapter dla, com.melodies.bandup.setup.SetupListeners sl, android.content.Context c, java.lang.String url) {
    org.json.JSONArray selectedItems = new org.json.JSONArray();
    for (com.melodies.bandup.setup.DoubleListItem dli : dla.getDoubleList()) {
        if (dli.isSelected) {
            selectedItems.put(dli.id);
        }
    }
    com.android.volley.toolbox.JsonRequest postItems = new com.android.volley.toolbox.JsonArrayRequest(Request.Method.POST, url, selectedItems, sl.getPickListener(), sl.getErrorListener());
    com.melodies.bandup.VolleySingleton.getInstance(c).addToRequestQueue(postItems);
}