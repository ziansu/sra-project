@java.lang.Override
public void error(java.lang.Throwable e) {
    error = java.util.Objects.requireNonNull(e, "error");
    done = true;
}