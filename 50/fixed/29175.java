@java.lang.Override
public void fit(jsat.DataSet data) {
    search(data, evaluator, minFeatures, maxFeatures, folds);
}