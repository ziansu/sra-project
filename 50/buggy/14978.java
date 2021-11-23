@java.lang.Override
public void close() {
    com.google.common.base.Preconditions.checkNotNull(stack);
    com.google.common.base.Preconditions.checkNotNull(mgr);
    stack.close();
    closed = true;
}