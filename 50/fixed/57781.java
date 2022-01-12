@org.junit.Test
public void sellOneImportedItemWithStandardTax() throws java.lang.Exception {
    pos.sell("1 imported bottle of perfume at 47.50");
    java.lang.String expected = "1 imported bottle of perfume: 54.65\n" + ("Sales Taxes: 7.15\n" + "Total: 54.65");
    org.junit.Assert.assertEquals(expected, pos.receipt());
}