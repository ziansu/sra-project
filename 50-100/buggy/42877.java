@java.lang.Override
public void aggregate(org.deeplearning4j.nn.api.Updater updater) {
    org.deeplearning4j.nn.updater.BaseUpdater bu = ((org.deeplearning4j.nn.updater.BaseUpdater) (updater));
    for (java.lang.String s : bu.updaterForVariable.keySet()) {
        org.nd4j.linalg.learning.GradientUpdaterAggregator ag = aggregatorMap.get(s);
        org.nd4j.linalg.learning.GradientUpdater guToAdd = bu.updaterForVariable.get(s);
        if (ag == null) {
            ag = guToAdd.getAggregator(true);
        }
        ag.aggregate(guToAdd);
    }
}