private static java.lang.String computeRequest(java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> handMap) {
    java.lang.String key = " ";
    for (java.util.Map.Entry<java.lang.String, java.util.ArrayList<java.lang.String>> entry : handMap.entrySet()) {
        key = entry.getKey();
        java.util.ArrayList<java.lang.String> list = entry.getValue();
        if ((list.size()) > 1) {
            return key;
        }
    }
    return key;
}