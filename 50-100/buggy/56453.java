void addName(java.lang.String key, java.lang.String nameStr) {
    models.MapEntry e = new models.MapEntry();
    if (pMap.containsKey(key)) {
        e = pMap.get(key);
    }
    e.uri = key;
    e.name = nameStr;
    pMap.put(key, e);
}