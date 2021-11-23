@java.lang.Override
public rioko.drawmodels.configurations.AggregationAlgorithmConfiguration copy() {
    rioko.drawmodels.configurations.AggregationAlgorithmConfiguration res = new rioko.drawmodels.configurations.AggregationAlgorithmConfiguration();
    res.currentAlgorithm = res.algorithms.get(this.algorithms.indexOf(currentAlgorithm));
    return res;
}