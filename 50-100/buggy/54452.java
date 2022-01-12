public void checkRegLive(java.util.Set liveness) {
    for (java.lang.String key : map.keySet()) {
        java.lang.String HashKey = key;
        java.lang.String HashValue = map.get(HashKey);
        if (!(HashValue.equals("null"))) {
            checkLive(HashValue, liveness);
        }
    }
}