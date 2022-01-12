@org.junit.Test
public void testStrategyGeneticSearcherWithDistance() throws java.lang.InterruptedException, stsc.general.simulator.multistarter.StrategySearcherException {
    final stsc.general.simulator.multistarter.genetic.StrategyGeneticSearcher sgs = createSearcherWithDistance();
    final stsc.general.strategy.selector.StrategySelector selector = sgs.waitAndGetSelector();
    org.junit.Assert.assertEquals(stsc.general.simulator.multistarter.genetic.StrategyGeneticSearcherWithSettingsDistanceTest.maxGeneticStepsAmount, selector.getStrategies().size());
    final stsc.general.statistic.Metrics metrics = selector.getStrategies().get(0).getMetrics();
    final java.lang.Double costValue = getCostFunction().calculate(metrics);
    org.junit.Assert.assertEquals((-541.798602), costValue, Settings.doubleEpsilon);
}