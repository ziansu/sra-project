@java.lang.Override
public void onBackPressed() {
    android.util.Log.d("BUG", "onBP");
    backPressed = true;
    super.onBackPressed();
}