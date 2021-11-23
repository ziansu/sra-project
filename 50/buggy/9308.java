@java.lang.Override
public void onBackPressed() {
    setResult(com.team19.gtmovies.activity.RESULT_CANCELED);
    super.onBackPressed();
    finish();
}