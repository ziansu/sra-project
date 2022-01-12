@org.junit.Test
public void testSelectBestPoolNoPools() {
    when(this.prodAdapter.getProductById(org.candlepin.policy.AutobindRulesTest.HIGHEST_QUANTITY_PRODUCT)).thenReturn(new org.candlepin.model.Product(org.candlepin.policy.AutobindRulesTest.HIGHEST_QUANTITY_PRODUCT, org.candlepin.policy.AutobindRulesTest.HIGHEST_QUANTITY_PRODUCT));
    assertEquals(0, autobindRules.selectBestPools(consumer, new java.lang.String[]{ org.candlepin.policy.AutobindRulesTest.HIGHEST_QUANTITY_PRODUCT }, new java.util.LinkedList<org.candlepin.model.Pool>(), compliance, null, new java.util.HashSet<java.lang.String>(), false).size());
}