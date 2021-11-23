@java.lang.Override
public double evaluate(final org.knime.base.node.mine.regression.logistic.learner4.glmnet.ClassificationTrainingRow row, final double[] prediction) {
    final double logSumExp = org.knime.base.node.mine.regression.logistic.learner4.sag.MultinomialLoss.logSumExp(prediction);
    assert java.lang.Double.isFinite(logSumExp);
    final int cat = row.getCategory();
    return cat == (prediction.length) ? logSumExp - 1 : logSumExp - (prediction[row.getCategory()]);
}