@java.lang.Override
public rioko.drawmodels.configurations.LayoutAlgorithmConfiguration copy() {
    rioko.drawmodels.configurations.LayoutAlgorithmConfiguration res = new rioko.drawmodels.configurations.LayoutAlgorithmConfiguration();
    res.currentAlgorithm = res.algorithms.get(this.indexOf(this.currentAlgorithm));
    return res;
}