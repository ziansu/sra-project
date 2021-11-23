@java.lang.Override
public final boolean isComplete() {
    synchronized(this) {
        return buffer.isComplete();
    }
}