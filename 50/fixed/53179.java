public void asyncRefresh() {
    executor.execute(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            doRefresh();
        }
    });
}