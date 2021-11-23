private void addValue(java.lang.Object key, java.lang.Object value) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
    java.util.Map map = ((java.util.Map) (f.get(bean)));
    if (map == null) {
        map = new java.util.HashMap();
        f.set(bean, map);
    }
    map.put(key, value);
}