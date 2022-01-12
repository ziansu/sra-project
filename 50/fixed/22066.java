@java.lang.Override
protected void hookAnalyze(net.taken.bernard.common.Sentence sentence, net.taken.bernard.analysis.SentenceAnalysis.SentenceAnalysisBuilder sentenceAnalysisBuilder) {
    net.taken.bernard.analysis.attribute.SentenceType res = getSentenceType(sentence);
    sentenceAnalysisBuilder.sentenceType(res);
    next = res.getAnalyser();
}