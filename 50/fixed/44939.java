@org.junit.Test
public void testRegionIsFoundWithSiftLt() {
    testFiltersHelper("11", 190000, 193719, new java.util.ArrayList<>(), new java.util.ArrayList<>(), null, null, null, null, VariantEntityRepository.RelationalOperator.LT, 0.5, 11);
}