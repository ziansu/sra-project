public boolean checkAppliedBefore(int commandId) {
    if (recentAppended.contains(commandId))
        return true;
    
    if ((this.recentAppended.size()) >= 50) {
        this.recentAppended.removeFirst();
    }
    this.recentAppended.add(commandId);
    return false;
}