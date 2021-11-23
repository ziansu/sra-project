@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    android.content.Intent intentMain = new android.content.Intent(this, com.mcnvr.amfmmodulator.activities.MainActivity.class);
    if ((android.os.Build.VERSION.SDK_INT) >= (android.os.Build.VERSION_CODES.JELLY_BEAN)) {
        android.os.Bundle bundle = android.app.ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.activity_animation, R.anim.activity_animation2).toBundle();
        startActivity(intentMain, bundle);
    }
}