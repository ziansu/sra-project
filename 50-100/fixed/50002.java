public GeneralF1Predictor.Analysis showPredictBySupport(java.util.Vector vector, edu.neu.ccs.pyramid.dataset.MultiLabel truth) {
    double[] probArray = cbm.predictAssignmentProbs(vector, support);
    edu.neu.ccs.pyramid.multilabel_classification.plugin_rule.GeneralF1Predictor generalF1Predictor = new edu.neu.ccs.pyramid.multilabel_classification.plugin_rule.GeneralF1Predictor();
    edu.neu.ccs.pyramid.dataset.MultiLabel prediction = generalF1Predictor.predict(cbm.getNumClasses(), support, probArray);
    edu.neu.ccs.pyramid.multilabel_classification.plugin_rule.GeneralF1Predictor.Analysis analysis = edu.neu.ccs.pyramid.multilabel_classification.plugin_rule.GeneralF1Predictor.showSupportPrediction(support, probArray, truth, prediction, cbm.getNumClasses());
    return analysis;
}