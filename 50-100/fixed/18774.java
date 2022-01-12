public void start(Params... params) {
    if ((net.zionsoft.obadiah.utils.SimpleAsyncTask.getStatus()) != (Status.PENDING)) {
        com.crashlytics.android.Crashlytics.logException(new java.lang.IllegalStateException(("Attempted to start an async task with state " + (net.zionsoft.obadiah.utils.SimpleAsyncTask.getStatus()))));
        return ;
    }
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.HONEYCOMB)) {
        try {
            executeOnExecutor(net.zionsoft.obadiah.utils.THREAD_POOL_EXECUTOR, params);
        } catch (java.util.concurrent.RejectedExecutionException e) {
            com.crashlytics.android.Crashlytics.logException(e);
        }
    }else {
        net.zionsoft.obadiah.utils.SimpleAsyncTask.execute(params);
    }
}