@java.lang.Override
public void onResume() {
    super.onResume();
    finish();
    startActivity(getIntent());
}