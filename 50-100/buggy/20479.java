@java.lang.Override
public void annotate(edu.stanford.nlp.pipeline.Annotation annotation) {
    checkForRequiredAnnotations(annotation);
    java.util.List<edu.stanford.nlp.util.CoreMap> sentences = annotation.get(CoreAnnotations.SentencesAnnotation.class);
    java.util.List<java.util.List<edu.stanford.nlp.hcoref.data.Mention>> mentions = md.findMentions(annotation, dictionaries, corefProperties);
    int currIndex = 0;
    for (edu.stanford.nlp.util.CoreMap sentence : sentences) {
        java.util.List<edu.stanford.nlp.hcoref.data.Mention> mentionsForThisSentence = mentions.get(currIndex);
        sentence.set(CorefCoreAnnotations.CorefMentionsAnnotation.class, mentionsForThisSentence);
        currIndex++;
    }
}