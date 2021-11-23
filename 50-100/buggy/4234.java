@org.junit.Test
public void testFillsWinningList() throws java.lang.Exception {
    com.jraska.vsb.or1.schedule.SelfAdaptiveSearchStrategy strategy = new com.jraska.vsb.or1.schedule.SelfAdaptiveSearchStrategy(new com.jraska.vsb.or1.schedule.SelfAdaptiveStrategyTest.GettingBetterFunction());
    for (int i = 0, size = strategy.getSize(); i < size; i++) {
        strategy.getNext(new int[2]);
    }
    org.junit.Assert.assertThat(strategy.getWinningNeighbourStrategies().size(), org.hamcrest.core.IsEqual.equalTo(strategy.getSize()));
}