protected void addValue(java.lang.String key, java.lang.String value) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
    java.util.Map map = ((java.util.Map) (f.get(bean)));
    if (map == null) {
        map = new java.util.HashMap();
        f.set(bean, map);
    }
    map.put(key, value);
}