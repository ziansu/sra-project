private void bumpCache(java.util.Map<java.lang.String, ninja.egg82.patterns.Pair<java.lang.Integer, java.lang.Integer>> cache, java.lang.String key) {
    ninja.egg82.patterns.Pair<java.lang.Integer, java.lang.Integer> value = cache.get(key);
    cache.remove(key);
    cache.put(key, value);
}