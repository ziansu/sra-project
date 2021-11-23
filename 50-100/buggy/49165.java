public boolean addAndDo(aa.monoglot.ui.history.HistoryAction action) {
    executingHistoryAction = true;
    if (action.doAction()) {
        history.push(action);
        if ((history.size()) > (aa.monoglot.ui.history.History.MAX_HISTORY_SIZE))
            history.removeLast();
        
        future.clear();
        hasNoHistory.set(false);
        hasNoFuture.set(true);
        return true;
    }
    return false;
}