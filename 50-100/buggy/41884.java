@java.lang.Override
public com.eclipsesource.json.JsonObject toJson() {
    if ((lastAccessNanos) < 0) {
        return null;
    }
    com.eclipsesource.json.JsonObject root = new com.eclipsesource.json.JsonObject();
    root.add("id", id);
    root.add("startedAt", startedAt);
    root.add("duration", durationNanos);
    return root;
}