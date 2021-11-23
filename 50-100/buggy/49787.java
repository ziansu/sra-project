@org.junit.Test
public void testGetTagsByQueryId() {
    com.google.common.collect.SetMultimap<java.lang.Long, java.lang.String> tags = userQueryDao.getQueryTags(java.util.Arrays.asList(16L));
    assertEquals(1, tags.size());
    assertEquals(com.google.common.collect.Sets.newHashSet("public"), tags.get(16L));
}