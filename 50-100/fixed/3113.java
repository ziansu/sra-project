public java.util.List<edu.asu.nlp.yelp.Pattern> run(java.lang.String text) {
    java.util.List<edu.asu.nlp.yelp.Pattern> patterns = new java.util.ArrayList<edu.asu.nlp.yelp.Pattern>();
    edu.stanford.nlp.pipeline.Annotation annotation = pipeline.process(text);
    java.util.List<edu.stanford.nlp.util.CoreMap> sentences = annotation.get(CoreAnnotations.SentencesAnnotation.class);
    for (edu.stanford.nlp.util.CoreMap sentence : sentences) {
        patterns.addAll(ExtractSentencePatterns(sentence));
    }
    return patterns;
}