@java.lang.Override
public void exception(final java.lang.Throwable exception) {
    if (!(exception instanceof org.jowidgets.cap.common.api.exception.ServiceCanceledException)) {
        invocationCallback.exeption(exception);
    }
}