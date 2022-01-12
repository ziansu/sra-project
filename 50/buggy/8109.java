public datatypes.annotatedSentence.AnnotatedSentence link(datatypes.annotatedSentence.AnnotatedSentence as, java.util.HashSet<java.lang.Integer> allEntities) {
    assignCandidates(as, allEntities);
    evaluator.evaluate(as);
    return as;
}