@java.lang.Override
public void onStart() {
    android.util.Log.d(TAG, "onStart - start");
    super.onStart();
    linLayout.removeAllViews();
    createInterface();
    android.util.Log.d(TAG, "onStart - finish");
}