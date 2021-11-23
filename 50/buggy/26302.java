@android.support.annotation.NonNull
public static com.androidadvance.topsnackbar.TSnackbar make(@android.support.annotation.NonNull
android.view.View view, @android.support.annotation.NonNull
java.lang.CharSequence text, @com.androidadvance.topsnackbar.TSnackbar.Duration
int duration) {
    com.androidadvance.topsnackbar.TSnackbar snackbar = new com.androidadvance.topsnackbar.TSnackbar(com.androidadvance.topsnackbar.TSnackbar.findSuitableParent(view));
    snackbar.setText(text);
    snackbar.setDuration(duration);
    return snackbar;
}