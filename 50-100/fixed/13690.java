public void forward() {
    if (future.isEmpty())
        return ;
    
    executingHistoryAction = true;
    if (future.peek().doAction()) {
        history.push(future.pop());
        hasNoHistory.set(false);
        hasNoFuture.set(future.isEmpty());
    }
    executingHistoryAction = false;
}