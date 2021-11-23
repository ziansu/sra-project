public static void shutdownExecutor(org.andstatus.app.os.MyAsyncTask.PoolEnum pool) {
    if (pool == (MyAsyncTask.PoolEnum.DEFAULT)) {
        throw new java.lang.IllegalArgumentException("Attempt to shut down default thread pool");
    }
    org.andstatus.app.os.AsyncTaskLauncher.getExecutor(pool).shutdown();
}