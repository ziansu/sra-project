@java.lang.Override
public boolean hasPendingData() {
    synchronized(this.pendingData) {
        return !(this.pendingData.isEmpty());
    }
}