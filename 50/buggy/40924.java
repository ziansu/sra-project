@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    startActivity(new android.content.Intent(this, eic.beike.projectx.android.activities.MenuActivity.class));
    finish();
}