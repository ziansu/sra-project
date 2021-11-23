public void addEvent(java.lang.String name, java.lang.String key) {
    org.json.JSONObject old = readUserJSON();
    org.json.JSONObject eventToAdd = new org.json.JSONObject();
    try {
        eventToAdd.put("name", name);
        eventToAdd.put("key", key);
        ((org.json.JSONArray) (old.get("events"))).put(eventToAdd);
        java.lang.System.out.println(("inAdd: " + (old.toString())));
        writeJSON(old);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}