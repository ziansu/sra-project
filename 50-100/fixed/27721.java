@java.lang.Override
public void close() {
    this.effectiveRibInWriter.close();
    this.writer.removePeer();
    this.chain.close();
    if ((this.moduleTracker) != null) {
        this.moduleTracker.onInstanceClose();
    }
}