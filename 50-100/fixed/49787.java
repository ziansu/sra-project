@org.junit.Test
public void testGetTagsByQueryId() {
    java.util.Map<java.lang.Long, java.util.Set<java.lang.String>> tags = userQueryDao.getQueryTags(java.util.Arrays.asList(16L));
    assertEquals(1, tags.size());
    assertEquals(com.google.common.collect.Sets.newHashSet("public"), tags.get(16L));
}