public void sendEditorStateChangedIntent() {
    sendBroadcastIntent(org.solovyev.android.calculator.CalculatorBroadcaster.ACTION_EDITOR_STATE_CHANGED);
}