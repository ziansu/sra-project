private static void showToast(final android.app.Activity activity, @android.support.annotation.Nullable
final java.lang.String msg, final int length) {
    java.lang.Runnable toastRunnable = new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            android.widget.Toast.makeText(activity, msg, length).show();
        }
    };
    io.particle.android.sdk.utils.EZ.runOnMainThread(toastRunnable);
}