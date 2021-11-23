public org.json.JSONObject favourite(int plaqueId, int userId) {
    org.json.JSONObject response = new org.json.JSONObject();
    boolean result = false;
    try {
        ubiserv.simple.tom.PlaqueAction plaqueAction = new ubiserv.simple.tom.plaqueAction(plaqueId, userId);
        result = plaqueAction.favourite();
        response.put("status", result);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return response;
}