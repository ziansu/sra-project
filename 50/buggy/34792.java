@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    android.content.Intent i = new android.content.Intent(this, org.oo.oodroid2.OoDroidActivity.class);
    startActivity(i);
    finish();
}