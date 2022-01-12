public void addLexiconEntryToChart(com.jayantkrish.jklol.ccg.chart.CcgChart chart, java.lang.Object trigger, com.jayantkrish.jklol.ccg.CcgCategory category, double lexiconProb, int spanStart, int spanEnd, int triggerSpanStart, int triggerSpanEnd, com.jayantkrish.jklol.nlpannotation.AnnotatedSentence sentence, int lexiconNum) {
    for (com.jayantkrish.jklol.ccg.lexicon.LexiconScorer lexiconScorer : lexiconScorers) {
        lexiconProb *= lexiconScorer.getCategoryWeight(triggerSpanStart, triggerSpanEnd, sentence, category);
    }
    com.jayantkrish.jklol.ccg.chart.ChartEntry chartEntry = ccgCategoryToChartEntry(trigger, category, spanStart, spanEnd, triggerSpanStart, triggerSpanEnd, lexiconNum);
    chart.addChartEntryForSpan(chartEntry, lexiconProb, spanStart, spanEnd, syntaxVarType);
}