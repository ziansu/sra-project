@java.lang.Override
public boolean isActive() {
    synchronized(this) {
        return this.active;
    }
}