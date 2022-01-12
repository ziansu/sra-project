public void onPause() {
    queueEvent(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mRenderer.handleOnPause();
        }
    });
}