private boolean isToReview(com.eclipsesource.json.JsonValue v) {
    final com.eclipsesource.json.JsonArray items = v.asObject().get("items").asArray();
    for (final com.eclipsesource.json.JsonValue item : items) {
        final com.eclipsesource.json.JsonObject io = item.asObject();
        if ((io.get("field").asString().equals("status")) && (io.get("toString").equals(this.reviewState))) {
            return true;
        }
    }
    return false;
}