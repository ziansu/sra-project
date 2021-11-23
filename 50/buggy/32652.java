public void onResume() {
    super.onResume();
    queueEvent(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mRenderer.handleOnResume();
        }
    });
}