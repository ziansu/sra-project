public java.lang.Integer getCount(java.lang.String url, java.lang.String term) {
    java.lang.String redisKey = termCounterKey(url);
    java.lang.String count = jedis.hget(redisKey, term);
    return new java.lang.Integer(count);
}