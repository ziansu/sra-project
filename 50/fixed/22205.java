@java.lang.Override
public void run() {
    tf.setText(contents);
    mainActivity.setContentView(tf);
    mainActivity.runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            tf.requestFocus();
        }
    });
}