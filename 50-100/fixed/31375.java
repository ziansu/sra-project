@org.junit.Test
public void getSessionNotFound() {
    java.lang.String id = "abc";
    org.mockito.Mockito.when(redisOperations.boundHashOps(getKey(id))).thenReturn(boundHashOperations);
    org.mockito.Mockito.when(boundHashOperations.entries()).thenReturn(map());
    org.fest.assertions.Assertions.assertThat(redisRepository.getSession(id)).isNull();
}