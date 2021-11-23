@org.springframework.transaction.annotation.Transactional
private void set(java.lang.String key, java.util.SortedMap<java.lang.Long, java.util.SortedSet<api.model.Event>> value) {
    template.opsForValue().set(key, value);
    template.expire(key, redisEntryTTL, java.util.concurrent.TimeUnit.SECONDS);
}