public static java.lang.String capitalized(@android.support.annotation.NonNull
final java.lang.String string) {
    return string.isEmpty() ? string : (string.substring(0, 1).toUpperCase()) + (string.substring(1));
}