public void annotate(edu.stanford.nlp.pipeline.Annotation annotation) {
    if (!(annotation.containsKey(CoreAnnotations.SentencesAnnotation.class)))
        throw new java.lang.RuntimeException(("Unable to find sentences in " + annotation));
    
    java.util.List<edu.stanford.nlp.util.CoreMap> sentences = annotation.get(CoreAnnotations.SentencesAnnotation.class);
    for (edu.stanford.nlp.util.CoreMap sentence : sentences) {
        java.util.List<edu.stanford.nlp.ling.CoreLabel> tokens = sentence.get(CoreAnnotations.TokensAnnotation.class);
        com.articulate.nlp.NERAnnotator.markTokens(tokens);
    }
}