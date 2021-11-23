@java.lang.Override
public T take() throws java.lang.InterruptedException {
    return forget(delegate.take());
}