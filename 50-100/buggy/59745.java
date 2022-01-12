private static void testSelectorUpdate(com.facebook.presto.resourceGroups.db.H2ResourceGroupsDao dao, java.util.Map<java.lang.Long, com.facebook.presto.resourceGroups.db.SelectorRecord> map) {
    dao.updateSelector(2, "ping.*", "ping_source", "ping_user", ".*");
    com.facebook.presto.resourceGroups.db.SelectorRecord updated = new com.facebook.presto.resourceGroups.db.SelectorRecord(2, java.util.Optional.of(java.util.regex.Pattern.compile("ping.*")), java.util.Optional.of(java.util.regex.Pattern.compile("ping_source")));
    map.remove(2);
    map.put(2L, updated);
    com.facebook.presto.resourceGroups.db.TestResourceGroupsDao.compareSelectors(map, dao.getSelectors());
}