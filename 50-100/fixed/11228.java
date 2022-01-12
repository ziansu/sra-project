private void generateSmallToast(java.lang.String info) {
    final android.widget.Toast toast = android.widget.Toast.makeText(getBaseContext(), info, Toast.LENGTH_SHORT);
    toast.show();
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            toast.cancel();
        }
    }, 500);
}