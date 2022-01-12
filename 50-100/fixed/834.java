@org.junit.Test
public void testRegionIsFoundWithStudies() {
    java.util.List<java.lang.String> studies = new java.util.ArrayList<>();
    studies.add("PRJEB6930");
    testFiltersHelper("11", 190000, 191000, studies, new java.util.ArrayList<>(), null, null, null, null, null, null, 14);
}