public boolean checkAppliedBefore(int commandId) {
    for (int cmdId : this.recentAppended) {
        if (cmdId == commandId) {
            return true;
        }
    }
    if ((this.recentAppended.size()) >= 50) {
        this.recentAppended.removeFirst();
    }
    this.recentAppended.add(commandId);
    return false;
}