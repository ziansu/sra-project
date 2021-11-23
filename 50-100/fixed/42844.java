private static void postMessage(@android.support.annotation.NonNull
android.os.Handler handler, @android.support.annotation.Nullable
final android.app.ProgressDialog dialog, @android.support.annotation.Nullable
final java.lang.String message) {
    if ((dialog != null) && (message != null)) {
        handler.post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                dialog.setMessage(message);
            }
        });
    }
}