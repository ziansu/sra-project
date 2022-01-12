private org.flightofstairs.honours.analysis.ClassScorer getScorer() {
    java.lang.String scorerString;
    if ((scorerSelector) == null)
        scorerString = ((java.lang.String) (scorerSelectModel.getElementAt(0)));
    else
        scorerString = ((java.lang.String) (scorerSelector.getSelectedItem()));
    
    return ((org.flightofstairs.honours.analysis.ClassScorer) (ScorerFactory.scorers.get(scorerString).call(callGraph)));
}