@java.lang.Override
public boolean isReady(final long time) {
    while (true) {
        final long thisTs = this.current.get();
        if ((thisTs >= time) || (this.current.compareAndSet(thisTs, time))) {
            return true;
        }
    } 
}