private void assignRecommendation() {
    int recommendation = -1;
    if ((mySPC.getMyAssignedManuscripts().size()) <= 0) {
        java.lang.System.out.println("\nNo papers assigned");
        return ;
    }
    model.Manuscript manuscript = selectManuscriptPrompt();
    if (java.util.Objects.isNull(manuscript))
        return ;
    
    displayRecommendationSelect(manuscript.getScale());
    recommendation = view.SystemHelper.promptUserInt();
    if (recommendation == 0)
        return ;
    
    finalizeRecommendation(manuscript, (recommendation - 1));
}