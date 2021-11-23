@java.lang.Override
public void run() {
    super.run();
    android.util.Log.wtf("wtf", "sss");
    currentMovie = getArguments().getParcelable("movie");
    android.util.Log.wtf("wtf", "xxx");
    new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            progressDialog.dismiss();
            init();
        }
    });
}