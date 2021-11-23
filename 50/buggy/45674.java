@org.junit.Test
public void testRegionIsFoundWithPolyphenGt() {
    testFiltersHelper("11", 190000, 193719, new java.util.ArrayList<>(), null, null, VariantEntityRepository.RelationalOperator.GT, 0.5, null, null, new java.util.ArrayList<>(), 4);
}