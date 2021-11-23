@java.lang.Override
public void close() {
    try {
        reset(StreamCollector.NO_OP);
        sync();
        release.accept(this);
    } catch (java.lang.Exception ex) {
        dispose();
    }
}