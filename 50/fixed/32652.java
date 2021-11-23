public void onResume() {
    queueEvent(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mRenderer.handleOnResume();
        }
    });
}