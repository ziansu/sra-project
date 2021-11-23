@java.lang.Override
public void onBackPressed() {
    backpress = (backpress) + 1;
    if (((backpress) < 1) || ((backpress) == 1)) {
        android.widget.Toast.makeText(getApplicationContext(), " Press Back again to Exit ", Toast.LENGTH_SHORT).show();
    }
    if ((backpress) > 1) {
        session1.logoutUser();
        this.finish();
    }
}