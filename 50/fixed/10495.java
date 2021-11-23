@org.junit.Test
public void testIsListEmptyOrBetweenNumberOfItemsWhenListSizeIs1AndShouldBeBetween1And1() throws java.lang.Exception {
    java.util.List<java.lang.String> list = java.util.Arrays.asList("");
    boolean listEmptyOrBetweenNumberOfItems = fact.isListEmptyOrBetweenNumberOfItems(list, 1, 1);
    assertTrue(listEmptyOrBetweenNumberOfItems);
}