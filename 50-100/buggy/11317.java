public java.util.Map<java.lang.String, java.lang.Integer> getBlacklistedVW() {
    java.util.Map<java.lang.String, java.lang.Integer> blacklistedVW = new java.util.HashMap<java.lang.String, java.lang.Integer>(redis.dbSize().intValue());
    java.util.Set<java.lang.String> keys = redis.smembers(this.prefix);
    java.util.Iterator<java.lang.String> it = keys.iterator();
    while (it.hasNext()) {
        java.lang.String key = it.next();
        blacklistedVW.put(key, (-1));
    } 
    return blacklistedVW;
}