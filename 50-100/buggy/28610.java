private java.util.TreeMap<java.lang.Integer, java.lang.Integer> getTreeMap(int index) {
    java.lang.Integer key = java.lang.Integer.valueOf(index);
    java.util.TreeMap<java.lang.Integer, java.lang.Integer> map = rbs.get(key);
    if (map == null) {
        map = new java.util.TreeMap<java.lang.Integer, java.lang.Integer>();
        rbs.put(key, map);
    }
    return map;
}