public void back() {
    if (history.isEmpty())
        return ;
    
    executingHistoryAction = true;
    if (history.peek().undoAction()) {
        future.push(history.pop());
        hasNoHistory.set(history.isEmpty());
        hasNoFuture.set(false);
    }
}