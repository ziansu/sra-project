@java.lang.Override
public void run() {
    super.run();
    currentMovie = getArguments().getParcelable("movie");
    new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            progressDialog.dismiss();
            init();
        }
    });
}