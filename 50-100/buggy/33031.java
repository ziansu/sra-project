@java.lang.Override
public void stacktrace(java.lang.Throwable throwable) {
    this.error(throwable.getLocalizedMessage());
    final java.lang.StackTraceElement[] elements = throwable.getStackTrace();
    for (final java.lang.StackTraceElement element : elements) {
        this.error(element.toString());
    }
}