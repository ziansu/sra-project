@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    util = new com.qualcomm.robotcore.hardware.configuration.Utility(this);
    if (getClass().getCanonicalName().equals(org.webb.robowizzard.MainActivity.class.getCanonicalName())) {
        org.webb.robowizzard.BaseActivity.toggleCallback = new java.util.ArrayList<android.view.MenuItem>();
        org.webb.robowizzard.BaseActivity.screenSize = new android.graphics.Point();
    }
    ((android.view.WindowManager) (this.getSystemService(Context.WINDOW_SERVICE))).getDefaultDisplay().getSize(org.webb.robowizzard.BaseActivity.screenSize);
}