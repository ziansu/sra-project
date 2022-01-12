public org.json.JSONObject getJSON() {
    org.json.JSONObject object = new org.json.JSONObject();
    object.put("posX", x);
    object.put("posY", y);
    object.put("score", score);
    object.put("isKilled", isKilled.get());
    object.put("isMoving", isMoving.get());
    object.put("direction", direction);
    return object;
}