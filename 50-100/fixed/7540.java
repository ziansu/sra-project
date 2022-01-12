private java.lang.String exportPointsAsJSON() {
    org.json.JSONArray arr = new org.json.JSONArray();
    for (fusorvis.Point p : points) {
        org.json.JSONObject obj = new org.json.JSONObject();
        obj.put("x", p.x);
        obj.put("y", p.y);
        obj.put("z", p.z);
        obj.put("charge", p.charge);
        arr.put(obj);
    }
    return arr.toString();
}