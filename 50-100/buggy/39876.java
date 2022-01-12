private java.util.Map<java.lang.String, java.lang.String> keyValuePairsToMap(java.lang.String keyValuePairs) {
    java.util.Map<java.lang.String, java.lang.String> map = new java.util.HashMap<java.lang.String, java.lang.String>();
    java.lang.String[] keyValuePairsArr = keyValuePairs.split("\r\n");
    for (java.lang.String keyValuePair : keyValuePairsArr) {
        java.lang.String[] keyValueArr = keyValuePair.split(":");
        map.put(keyValueArr[0], keyValueArr[1]);
    }
    return map;
}