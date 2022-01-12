private java.util.Map<java.lang.String, java.lang.String> readToMap(java.lang.String input) {
    java.util.Map<java.lang.String, java.lang.String> cleanUpMap = new java.util.HashMap<>();
    for (java.lang.String property : input.split(",")) {
        int index = property.indexOf(":");
        if (index > 0) {
            cleanUpMap.put(property.substring(0, index).trim(), property.substring((index + 1)).trim());
        }
    }
    return cleanUpMap;
}