@java.lang.Override
public boolean isCancelled() {
    synchronized(this) {
        if (cancelled) {
            return true;
        }
        if (super.isCancelled()) {
            cancel(super.cause());
            return true;
        }
    }
    return false;
}