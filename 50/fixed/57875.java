@java.lang.Override
public void onCallForwardingIndicatorChanged(boolean cfi) {
    super.onCallForwardingIndicatorChanged(cfi);
    if ((forwardToggle.isChecked()) != cfi) {
        forwardingChangeDetected = true;
        forwardToggle.setChecked(cfi);
    }
}