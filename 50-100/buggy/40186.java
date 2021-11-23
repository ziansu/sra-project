public long zaddString(ria.Jedis conn, java.lang.String name, java.util.Map<java.lang.String, java.lang.String> values) {
    java.util.Map<java.lang.Double, java.lang.String> pieces = new java.util.HashMap<java.lang.Double, java.lang.String>(values.size());
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : values.entrySet()) {
        pieces.put(((double) (stringToScore(entry.getValue()))), entry.getKey());
    }
    return conn.zadd(name, pieces);
}