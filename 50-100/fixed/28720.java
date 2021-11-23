@org.junit.Test
public void testQueryById() {
    strategy = strategyDaoImpl.queryById(14);
    java.lang.System.out.println(strategy.getSecurity().toString());
    org.junit.Assert.assertEquals("testTradeIdNull1", strategy.getStrategyName());
    org.junit.Assert.assertEquals("desc1", strategy.getDescription());
    org.junit.Assert.assertEquals(0.2, strategy.getExit(), 0);
    org.junit.Assert.assertEquals("A", strategy.getSecurity().getNameAbbreviation());
}