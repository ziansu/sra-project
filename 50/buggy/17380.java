@java.lang.Override
public void onResume() {
    super.onRestart();
    finish();
    startActivity(getIntent());
}