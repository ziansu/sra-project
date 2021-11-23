private void showToast(final java.lang.String message) {
    final android.content.Context ctx = this;
    this.runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            android.widget.Toast.makeText(ctx, message, Toast.LENGTH_SHORT).show();
        }
    });
}