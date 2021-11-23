@java.lang.Override
@java.lang.SafeVarargs
public final <ParamsT, ProgressT, ResultT> void runTask(final android.os.AsyncTask<ParamsT, ProgressT, ResultT> asyncTask, final ParamsT... params) {
    mainHandler.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            asyncTask.execute(params);
        }
    });
}