@org.junit.Test
public void testTwoUnEqualItemsOnlyOneToDistribute() {
    java.util.Map<java.lang.String, java.lang.Double> ratios = new java.util.HashMap<>();
    ratios.put("A", 0.3);
    ratios.put("B", 0.9);
    java.util.Map<java.lang.String, java.lang.Integer> distributed = ojplg.skir.utils.RatioDistributor.distribute(ratios, 1);
    org.junit.Assert.assertEquals(1, distributed.size());
    org.junit.Assert.assertEquals(new java.lang.Integer(1), distributed.get("B"));
}