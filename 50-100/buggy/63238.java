@java.lang.Override
public void call(byte[] characteristic) {
    final java.lang.String text = toHexString(characteristic);
    lm(("wrote: " + text));
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            ((android.widget.TextView) (findViewById(textViewId))).setText(text);
        }
    });
}