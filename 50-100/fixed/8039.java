private long getNextBuildNumber(@javax.annotation.Nonnull
java.lang.Object entry) {
    if (entry instanceof hudson.model.Queue.Item) {
        hudson.model.Queue.Task task = ((hudson.model.Queue.Item) (entry)).task;
        if (task instanceof hudson.model.Job) {
            return ((hudson.model.Job) (task)).getNextBuildNumber();
        }
    }else
        if (entry instanceof hudson.model.Run) {
            return ((hudson.model.Run) (entry)).getParent().getNextBuildNumber();
        }
    
    return (jenkins.widgets.HistoryPageEntry.getEntryId(entry)) + 1;
}