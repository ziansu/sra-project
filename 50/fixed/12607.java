public void remove(java.lang.String key) {
    java.util.Map map = ((java.util.Map) (inheritableThreadLocal.get()));
    if (map != null) {
        map.remove(key);
    }
}