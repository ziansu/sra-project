@org.junit.Test
public void testRegionIsFoundWithConsequenceType() {
    java.util.List<java.lang.String> cts = new java.util.ArrayList<>();
    cts.add("SO:0001627");
    testFiltersHelper("11", 188000, 190000, new java.util.ArrayList<>(), cts, null, null, null, null, null, null, 94);
}