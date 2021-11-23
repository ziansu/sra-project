@java.lang.Override
public void fit(jsat.DataSet data) {
    super.fit(data);
    search(data, evaluator, minFeatures, maxFeatures, folds);
}