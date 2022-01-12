@java.lang.Override
public void stacktrace(final java.lang.Throwable throwable) {
    this.error(throwable.getClass().getName());
    this.stacktrace(throwable.getLocalizedMessage(), throwable);
}