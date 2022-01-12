private static void postMessage(@android.support.annotation.Nullable
android.os.Handler handler, @android.support.annotation.Nullable
final android.app.ProgressDialog dialog, @android.support.annotation.NonNull
final java.lang.String message) {
    if ((handler != null) && (dialog != null)) {
        handler.post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                dialog.setMessage(message);
            }
        });
    }
}