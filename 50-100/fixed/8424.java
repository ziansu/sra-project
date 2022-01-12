private edu.neu.ccs.pyramid.dataset.MultiLabel predictBySupport(java.util.Vector vector) {
    double[] probs = cbm.predictAssignmentProbs(vector, support, piThreshold);
    edu.neu.ccs.pyramid.multilabel_classification.plugin_rule.GeneralF1Predictor generalF1Predictor = new edu.neu.ccs.pyramid.multilabel_classification.plugin_rule.GeneralF1Predictor();
    generalF1Predictor.setMaxSize(maxSize);
    return generalF1Predictor.predict(cbm.getNumClasses(), support, probs);
}