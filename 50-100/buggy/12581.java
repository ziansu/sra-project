@java.lang.Override
public void onBackPressed() {
    if (exit) {
        super.onBackPressed();
        finish();
    }else {
        android.widget.Toast.makeText(this, getString(R.string.press_back_again), Toast.LENGTH_SHORT).show();
        exit = true;
        new android.os.Handler().postDelayed(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                exit = false;
            }
        }, (3 * (com.newrunner.googlemap.MainActivity.ONE_SECOND)));
    }
}