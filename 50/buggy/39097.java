@java.lang.Override
public void onRestart() {
    super.onRestart();
    finish();
    startActivity(getIntent());
}