@java.lang.Override
public void merge(org.deeplearning4j.nn.updater.aggregate.UpdaterAggregator aggregator) {
    org.deeplearning4j.nn.updater.BaseUpdater.UpdaterAggregatorImpl ag = ((org.deeplearning4j.nn.updater.BaseUpdater.UpdaterAggregatorImpl) (aggregator));
    if ((aggregatorMap) == null) {
        aggregatorMap = ag.aggregatorMap;
    }else {
        if ((ag.aggregatorMap) == null)
            return ;
        
        for (java.lang.String s : aggregatorMap.keySet()) {
            org.nd4j.linalg.learning.GradientUpdaterAggregator first = aggregatorMap.get(s);
            org.nd4j.linalg.learning.GradientUpdaterAggregator second = ag.aggregatorMap.get(s);
            first.combine(second);
        }
    }
}