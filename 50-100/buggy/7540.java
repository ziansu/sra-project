private java.lang.String exportPointsAsJSON() {
    org.json.JSONArray arr = new org.json.JSONArray();
    for (fusorvis.Point p : points) {
        org.json.JSONObject obj = new org.json.JSONObject();
        obj.append("x", p.x);
        obj.append("y", p.y);
        obj.append("z", p.z);
        obj.append("charge", p.charge);
        arr.put(obj);
    }
    return arr.toString();
}