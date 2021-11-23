public void remove(java.lang.String key) {
    if ((map.get(key)) != null) {
        map.get(key).release();
        map.remove(key);
    }
}