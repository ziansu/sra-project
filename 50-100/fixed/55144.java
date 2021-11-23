@java.lang.Override
public java.lang.String summarize(java.lang.String text) {
    java.util.List<java.lang.String> frequentWords = frequentWords(text.toLowerCase());
    java.util.List<java.lang.String> sentences = breakIntoSentences(text);
    java.util.Map<java.lang.String, java.lang.Double> sentenceScores = scoreSentences(sentences, frequentWords);
    java.util.List<java.lang.String> byRankSentences = byRank(sentenceScores);
    return byAppearanceSentences(byRankSentences, sentences);
}