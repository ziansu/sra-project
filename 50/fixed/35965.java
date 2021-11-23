@java.lang.Override
public void cancel(final java.lang.String reason) {
    if ((command) instanceof org.scijava.Cancelable) {
        ((org.scijava.Cancelable) (command)).cancel(reason);
        return ;
    }
    cancelReason = (reason == null) ? "" : reason;
}