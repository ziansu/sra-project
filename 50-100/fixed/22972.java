public java.lang.String generateHTML(eu.excitementproject.eop.alignmentedas.p1eda.TEDecisionWithAlignment decision) throws eu.excitementproject.eop.alignmentedas.p1eda.visualization.VisualizerGenerationException {
    init();
    org.apache.uima.jcas.JCas jCas = decision.getJCasWithAlignment();
    java.util.Vector<eu.excitementproject.eop.alignmentedas.p1eda.subs.FeatureValue> featureValues = decision.getFeatureVector();
    eu.excitementproject.eop.common.DecisionLabel label = decision.getDecision();
    java.lang.Double confidence = decision.getConfidence();
    try {
        return generateHTML(jCas, label.toString(), confidence.toString(), featureValues);
    } catch (eu.excitementproject.eop.alignmentedas.p1eda.subs.ValueException e) {
        throw new eu.excitementproject.eop.alignmentedas.p1eda.visualization.VisualizerGenerationException(e);
    }
}