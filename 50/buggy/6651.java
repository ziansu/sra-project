@java.lang.Override
public void visit(com.tngtech.jgiven.report.model.ScenarioCaseModel scenarioCase) {
    currentCase = scenarioCase;
    argumentsOfCurrentCase = com.google.common.collect.Lists.newArrayList();
    argumentMatrix.add(new com.tngtech.jgiven.report.analysis.CaseArgumentAnalyser.CaseArguments(currentCase, argumentsOfCurrentCase));
    allWordsOfCurrentCase = com.google.common.collect.Lists.newArrayList();
    allWords.add(allWordsOfCurrentCase);
}