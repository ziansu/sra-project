@org.junit.Test
public void testIsListNotEmptyAndBetweenNumberOfItemsWhenListSizeIs2AndShouldBeBetween3And5() throws java.lang.Exception {
    java.util.List<java.lang.String> list = java.util.Arrays.asList("", "");
    boolean listNotEmptyAndBetweenNumberOfItems = fact.isListNotEmptyAndBetweenNumberOfItems(list, 3, 5);
    assertFalse(listNotEmptyAndBetweenNumberOfItems);
}