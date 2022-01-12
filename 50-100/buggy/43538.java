@java.lang.Override
public void map(java.util.Map<java.lang.String, java.lang.Object> document, com.couchbase.lite.Emitter emitter) {
    if ("task".equals(document.get("type"))) {
        java.util.List<java.lang.Object> keys = new java.util.ArrayList<java.lang.Object>();
        keys.add(document.get("list_id"));
        keys.add(document.get("created_at"));
        emitter.emit(keys, null);
    }
}