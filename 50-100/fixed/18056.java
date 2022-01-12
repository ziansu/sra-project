public void destroy() {
    for (edu.stanford.braincat.rulepedia.events.EventSource s : eventSources) {
        try {
            s.uninstall(context);
        } catch (java.io.IOException e) {
            android.util.Log.e(RuleExecutorService.LOG_TAG, ("Failed to uninstall event source " + (s.toString())), e);
        }
    }
    eventSources.clear();
    for (edu.stanford.braincat.rulepedia.model.Rule r : edu.stanford.braincat.rulepedia.model.RuleDatabase.get().getAllRules())
        r.setInstalled(false);
    
}