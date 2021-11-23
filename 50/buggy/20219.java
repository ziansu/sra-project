@org.junit.Test
public void testIsListNotEmptyAndBetweenNumberOfItemsWhenListSizeIs2AndShouldBeBetween1And5() throws java.lang.Exception {
    java.util.List<java.lang.String> list = java.util.Arrays.asList("", "");
    boolean listNotEmptyAndBetweenNumberOfItems = fact.isListNotEmptyAndBetweenNumberOfItems(list, 1, 5);
    org.junit.Assert.assertTrue(listNotEmptyAndBetweenNumberOfItems);
}