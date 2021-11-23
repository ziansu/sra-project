@java.lang.Override
public boolean isDisposed() {
    return observers.contains(observer);
}