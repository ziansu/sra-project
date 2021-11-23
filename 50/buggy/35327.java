@java.lang.Override
protected void onResume() {
    super.onResume();
    if (isAvailable()) {
        return ;
    }
    mMessageShow.postOnAnimation(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            syncSoftKeyboardStatus();
        }
    });
}