@java.lang.Override
public double scoreTerm(java.lang.String term) {
    edu.gslis.textrepresentation.FeatureVector docVector = doc.getFeatureVector();
    double wordCount = docVector.getFeatureWeight(term);
    double docLength = docVector.getLength();
    double colProb = ((epsilon) + (collectionStats.termCount(term))) / (collectionStats.getTokCount());
    double score = (wordCount + ((mu) * colProb)) / (docLength + (mu));
    return score;
}