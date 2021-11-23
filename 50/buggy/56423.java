public void startActivity(final android.content.Context context, android.content.Intent intent) {
    new java.lang.Thread() {
        @java.lang.Override
        public void run() {
            captureScreen(context);
        }
    }.start();
    context.startActivity(intent);
}