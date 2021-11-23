public static void handleError(android.content.Context context, java.lang.String message, java.lang.Throwable e) {
    com.stablekernel.standardlib.Log.e(context.getClass().getSimpleName(), e.getLocalizedMessage(), e);
    if ((BuildConfig.DEBUG) || (message != null)) {
        android.widget.Toast.makeText(context, (message == null ? e.getLocalizedMessage() : message), Toast.LENGTH_LONG).show();
    }
}