public long getLastLogTerm() {
    long lastLogIndex = this.getLastLogIndex();
    return this.getEntry(lastLogIndex).getTerm();
}