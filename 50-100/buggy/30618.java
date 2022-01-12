public org.json.JSONObject favourite(int plaqueId, int userId) {
    org.json.JSONObject response = new org.json.JSONObject();
    int id = 0;
    try {
        ubiserv.simple.tom.PlaqueAction plaqueAction = new ubiserv.simple.tom.PlaqueAction(plaqueId, userId);
        id = plaqueAction.favourite();
        response.put("status", id);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return response;
}