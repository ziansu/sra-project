@java.lang.Override
public synchronized int numPoints() {
    synchronized(this.preLoadingLock) {
        while (this.preLoading) {
            try {
                this.preLoadingLock.wait();
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        } 
    }
    return (this.points) == null ? 0 : this.points.size();
}