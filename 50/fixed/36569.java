@java.lang.Override
public void clear() {
    synchronized(decorated) {
        if (!(decorated.isEmpty())) {
            decorated.clear();
            dirtyFlag.set(true);
        }
    }
}