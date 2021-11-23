@java.lang.Override
public void cancel(final java.lang.String reason) {
    cancelReason = (reason == null) ? "" : reason;
    if ((command) instanceof org.scijava.Cancelable) {
        ((org.scijava.Cancelable) (command)).cancel(reason);
    }
}