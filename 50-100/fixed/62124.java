@org.junit.Test
public void sellMultipleNotImportedItems() throws java.lang.Exception {
    pos.sell("1 book at 12.49");
    pos.sell("1 music CD at 14.99");
    pos.sell("1 chocolate bar at 0.85");
    java.lang.String expected = "1 book: 12.49\n" + ((("1 music CD: 16.49\n" + "1 chocolate bar: 0.85\n") + "Sales Taxes: 1.50\n") + "Total: 29.83");
    org.junit.Assert.assertEquals(expected, pos.receipt());
}