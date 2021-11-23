private edu.neu.ccs.pyramid.dataset.MultiLabel predictBySampling(java.util.Vector vector) {
    java.util.List<edu.neu.ccs.pyramid.dataset.MultiLabel> samples = cbm.samples(vector, numSamples);
    edu.neu.ccs.pyramid.multilabel_classification.plugin_rule.GeneralF1Predictor generalF1Predictor = new edu.neu.ccs.pyramid.multilabel_classification.plugin_rule.GeneralF1Predictor();
    generalF1Predictor.setMaxSize(maxSize);
    return generalF1Predictor.predict(cbm.getNumClasses(), samples);
}