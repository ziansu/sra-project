public java.util.Map toMap() {
    java.util.HashMap<java.lang.String, java.lang.Object> map = new java.util.HashMap<>();
    map.put("itemId", itemId);
    map.put("tracked", tracked);
    map.put("job", job.toMap());
    return map;
}