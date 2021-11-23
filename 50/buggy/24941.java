public static void setText(android.app.Activity activity, android.widget.TextView textView, java.lang.String str) {
    activity.runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            textView.setText(str);
        }
    });
}