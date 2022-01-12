@java.lang.Override
public org.fyrz.solr.explain.model.DocumentMatch interprets(java.util.List<org.fyrz.solr.explain.parser.types.ExplainElement> explainElements, org.fyrz.solr.explain.model.DocumentMatch documentMatch) {
    java.lang.Double documentScore = java.lang.Double.valueOf(explainElements.get(0).getData());
    documentMatch.setScore(documentScore);
    if ((explainElements.size()) > 5) {
        if ((explainElements.get(3).getType().equals(ExplainElementType.MAXPLUS)) && (explainElements.get(4).getType().equals(ExplainElementType.NUMBER))) {
        }
    }
    return documentMatch;
}