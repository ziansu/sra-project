private static java.util.HashMap<java.lang.String, java.lang.Integer> fillMapAndCounting(java.util.HashMap<java.lang.String, java.lang.Integer> map, java.lang.String[] strArray) {
    for (java.lang.String string : strArray) {
        int value = 1;
        if (map.containsKey(string)) {
            value = map.get(string);
            value++;
        }
        map.put(string, value);
    }
    return map;
}