@org.junit.Test
public void testGetTagsByUnknownQueryIds() {
    com.google.common.collect.SetMultimap<java.lang.Long, java.lang.String> tags = userQueryDao.getQueryTags(java.util.Arrays.asList(16L, 17L));
    assertTrue((!(tags.isEmpty())));
    assertEquals(com.google.common.collect.Sets.newHashSet("public"), tags.get(16L));
    assertEquals(com.google.common.collect.Sets.<java.lang.String>newHashSet(), tags.get(17L));
}