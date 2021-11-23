@org.junit.Test
public void getSessionExpired() {
    java.lang.String expiredId = "expired-id";
    org.mockito.Mockito.when(redisOperations.boundHashOps(getKey(expiredId))).thenReturn(boundHashOperations);
    java.util.Map map = map(org.springframework.session.data.redis.RedisOperationsSessionRepository.MAX_INACTIVE_ATTR, 1, org.springframework.session.data.redis.RedisOperationsSessionRepository.LAST_ACCESSED_ATTR, ((java.lang.System.currentTimeMillis()) - (java.util.concurrent.TimeUnit.MINUTES.toMillis(5))));
    org.mockito.Mockito.when(boundHashOperations.entries()).thenReturn(map);
    org.fest.assertions.Assertions.assertThat(redisRepository.getSession(expiredId)).isNull();
}