public java.util.ArrayList<java.lang.String> getPoiOrder() {
    org.json.JSONArray array = getJSONArray("poiOrder");
    java.util.ArrayList<java.lang.String> poiOrder = new java.util.ArrayList<>();
    if (array != null) {
        for (int i = 0; i < (array.length()); i++) {
            try {
                poiOrder.add(array.getString(i));
            } catch (org.json.JSONException e) {
                e.printStackTrace();
            }
        }
    }
    return poiOrder;
}