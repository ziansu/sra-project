@org.junit.Test
public void testGetTagsByUnknownQueryId() {
    java.util.Map<java.lang.Long, java.util.Set<java.lang.String>> tags = userQueryDao.getQueryTags(java.util.Arrays.asList(17L));
    assertTrue(tags.isEmpty());
    assertEquals(com.google.common.collect.Sets.<java.lang.String>newHashSet(), tags.get(17L));
}