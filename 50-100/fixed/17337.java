@java.lang.Override
public void onBackPressed() {
    if (doubleBackToExitPressedOnce) {
        java.lang.System.exit(0);
        return ;
    }
    this.doubleBackToExitPressedOnce = true;
    android.widget.Toast.makeText(this, "Please tap BACK again to Exit", Toast.LENGTH_SHORT).show();
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            doubleBackToExitPressedOnce = false;
        }
    }, 2000);
}