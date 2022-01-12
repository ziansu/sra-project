public static java.lang.String containsAllKeys(java.util.Map map, java.lang.String[] keys) {
    for (java.lang.String key : keys) {
        if (!(map.containsKey(key))) {
            return key;
        }
    }
    return null;
}