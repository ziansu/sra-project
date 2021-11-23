@org.junit.Test
public void testIsListEmptyOrBetweenNumberOfItemsWhenListIsEmpty() throws java.lang.Exception {
    java.util.List<java.lang.String> list = java.util.Collections.emptyList();
    boolean listEmptyOrBetweenNumberOfItems = fact.isListEmptyOrBetweenNumberOfItems(list, 1, 5);
    org.junit.Assert.assertTrue(listEmptyOrBetweenNumberOfItems);
}