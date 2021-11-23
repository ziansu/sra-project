@org.junit.Test
public void testRegionIsFoundWithMafGt() {
    testFiltersHelper("11", 185000, 190000, new java.util.ArrayList<>(), VariantEntityRepository.RelationalOperator.GT, 0.125, null, null, null, null, new java.util.ArrayList<>(), 37);
}