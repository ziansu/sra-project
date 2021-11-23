@java.lang.Override
public synchronized void setTaken(boolean taken) {
    if (!taken) {
        this.notifyAll();
        Dininghall.Fork.LOGGER.info((("Fork [" + (id)) + "] Notified waiting Philosophers"));
    }
    this.taken = taken;
}