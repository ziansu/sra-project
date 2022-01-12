void addName(java.lang.String key, java.lang.String obj) {
    models.MapEntry e = new models.MapEntry();
    if (pMap.containsKey(key)) {
        e = pMap.get(key);
    }
    e.uri = key;
    e.name = obj;
    pMap.put(key, e);
}