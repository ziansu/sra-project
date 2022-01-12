@java.lang.Override
public void close() {
    try {
        reset(StreamCollector.NO_OP);
        sync();
    } catch (java.lang.Exception ex) {
        dispose();
    } finally {
        release.accept(this);
    }
}