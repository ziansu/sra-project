protected sentimentAnalysis.ScoreNode getNode(edu.emory.clir.clearnlp.dependency.DEPNode node, java.util.Map<java.lang.String, java.lang.Double> map) {
    double score = 0;
    double intensity = getIntensity(node);
    if (map.containsKey(node.getLemma())) {
        score = map.get(node.getLemma());
    }
    sentimentAnalysis.ScoreNode sNode = new sentimentAnalysis.ScoreNode(node.getLemma(), score, intensity);
    return sNode;
}