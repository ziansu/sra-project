public java.util.ArrayList<java.lang.Integer> findKey(java.lang.String key) {
    java.util.ArrayList<java.lang.Integer> value;
    if (map.containsKey(key)) {
        value = map.get(key);
    }else {
        value = null;
    }
    return value;
}