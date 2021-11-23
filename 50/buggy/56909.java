@java.lang.Override
public void shutdown() {
    if ((_first) != null) {
        _first.shutdown();
    }
    if ((_second) != null) {
        _second.shutdown();
    }
}