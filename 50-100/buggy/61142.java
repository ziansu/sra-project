@org.junit.Test
public void testCacheGetShouldRetunInstanceOfCorrectType() {
    assumeThat(cache, instanceOf(org.springframework.data.redis.cache.RedisCache.class));
    java.lang.Object key = getKey();
    java.lang.Object value = getValue();
    cache.put(key, value);
    org.springframework.data.redis.cache.RedisCache redisCache = ((org.springframework.data.redis.cache.RedisCache) (cache));
    assertThat(redisCache.get(key, value.getClass()), instanceOf(value.getClass()));
}