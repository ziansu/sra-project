public static void handleError(android.content.Context context, @android.support.annotation.NonNull
java.lang.String message, java.lang.Throwable e) {
    com.stablekernel.standardlib.Log.e(context.getClass().getSimpleName(), e.getLocalizedMessage(), e);
    if (BuildConfig.DEBUG) {
        android.widget.Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}