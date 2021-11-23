@java.lang.Override
public void execute() throws java.lang.Exception {
    if ((suggesters) == null) {
        return ;
    }
    totalItems = suggesters.size();
    for (dynamo.magazines.KioskIssuesSuggester kioskIssuesSuggester : suggesters) {
        if (cancelled) {
            return ;
        }
        setCurrentLabel(java.lang.String.format("Retrieving magazine issues from %s", kioskIssuesSuggester.toString()));
        try {
            kioskIssuesSuggester.suggestIssues();
        } catch (java.lang.Exception e) {
            dynamo.core.manager.ErrorManager.getInstance().reportThrowable(e);
        }
        (itemsDone)++;
    }
}