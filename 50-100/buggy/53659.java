@java.lang.Override
@java.lang.SafeVarargs
public final <ParamsT, ProgressT, ResultT> void runTask(final android.os.AsyncTask<ParamsT, ProgressT, ResultT> asyncTask, final ParamsT... params) {
    android.os.Handler mainHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    mainHandler.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            asyncTask.execute(params);
        }
    });
}