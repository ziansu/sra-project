public static boolean isRetryable(@android.support.annotation.NonNull
org.wikipedia.util.ThrowableUtil.AppError e) {
    return !(((e.getDetail()) != null) && (e.getDetail().contains("404")));
}