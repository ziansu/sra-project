public long zaddString(ria.Jedis conn, java.lang.String name, java.util.Map<java.lang.String, java.lang.String> values) {
    java.util.Map<java.lang.String, java.lang.Double> pieces = new java.util.HashMap<>(values.size());
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : values.entrySet()) {
        pieces.put(entry.getKey(), ((double) (stringToScore(entry.getValue()))));
    }
    return conn.zadd(name, pieces);
}