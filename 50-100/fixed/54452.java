public void checkRegLive(java.util.Set<java.lang.String> liveness) {
    for (java.lang.String key : map.keySet()) {
        java.lang.String value = map.get(key);
        if (!(value.equals("null"))) {
            checkLive(value, liveness);
        }
    }
}