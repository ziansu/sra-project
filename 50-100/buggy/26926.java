@org.junit.Test
public void shouldGetCategoryList() throws java.lang.Exception {
    java.util.List<java.lang.String> categories = idBasedSyncStrategy.getEventCategoriesList();
    org.junit.Assert.assertTrue(categories.contains("patient"));
    org.junit.Assert.assertTrue(categories.contains("encounter"));
    org.junit.Assert.assertTrue(categories.contains("addressHierarchy"));
    org.junit.Assert.assertTrue(categories.contains("offline-concepts"));
    org.junit.Assert.assertTrue(((categories.size()) == 4));
}