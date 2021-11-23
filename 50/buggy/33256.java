@java.lang.Override
public void onInitialized() {
    if (isLoggedIn()) {
        updateMyprofile(false);
        android.support.design.widget.Snackbar.make(navView, (("Welcome Back, " + (com.hwanghee.tennistogether.MainActivity.userName)) + "!"), Snackbar.LENGTH_SHORT).show();
    }
}