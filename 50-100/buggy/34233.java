@org.junit.Test
public void testIsListEmptyOrBetweenNumberOfItemsWhenMinNumberOfItemsIsBiggerThanMaxNumberOfItems() throws java.lang.Exception {
    expectedException.expectMessage("minNumberOfItems '5' can't be bigger than '1'");
    expectedException.expect(java.lang.IllegalArgumentException.class);
    java.util.List<java.lang.String> list = java.util.Collections.emptyList();
    boolean listEmptyOrBetweenNumberOfItems = fact.isListEmptyOrBetweenNumberOfItems(list, 5, 1);
    org.junit.Assert.assertTrue(listEmptyOrBetweenNumberOfItems);
}