@java.lang.Override
public void run() {
    callbackContext.success((com.marketo.Marketo.isSecureModeEnabled() ? 0 : 1));
}