public void asyncRefresh() {
    if (!(isRefreshing.get())) {
        executor.execute(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                doRefresh();
            }
        });
    }
}