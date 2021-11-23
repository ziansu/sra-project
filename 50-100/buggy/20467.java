@java.lang.Override
public boolean isReady(final org.apache.reef.wake.time.Time time) {
    for (; ;) {
        final long otherTs = time.getTimestamp();
        final long thisTs = this.current.get();
        if ((thisTs >= otherTs) || (this.current.compareAndSet(thisTs, otherTs))) {
            return true;
        }
    }
}