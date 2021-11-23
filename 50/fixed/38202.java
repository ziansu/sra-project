@java.lang.Override
public void activate() {
    synchronized(this) {
        this.lastFound.set(java.lang.System.currentTimeMillis());
        this.active = true;
    }
}