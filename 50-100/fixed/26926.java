@org.junit.Test
public void shouldGetCategoryList() throws java.lang.Exception {
    java.util.List<java.lang.String> categories = idBasedSyncStrategy.getEventCategoriesList();
    assertTrue(categories.contains("patient"));
    assertTrue(categories.contains("encounter"));
    assertTrue(categories.contains("addressHierarchy"));
    assertTrue(categories.contains("offline-concepts"));
    assertTrue(((categories.size()) == 4));
}