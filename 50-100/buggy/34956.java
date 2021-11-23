public static java.util.Map<java.lang.String, java.lang.String> decodeMap(java.lang.String value) {
    java.util.Map<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
    java.lang.String[] array = value.split(",");
    for (java.lang.String s : array) {
        java.lang.String[] entry = s.split(",", 2);
        map.put(entry[0], entry[1]);
    }
    return map;
}