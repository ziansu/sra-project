@org.junit.Test
public void testNullValues() {
    java.util.List<com.epam.ta.reportportal.database.entity.item.TestItem> history = testItemRepository.loadItemsHistory(null, null, null);
    org.junit.Assert.assertNotNull(history);
    org.junit.Assert.assertEquals(history.size(), 0);
}