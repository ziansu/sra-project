@java.lang.Override
protected void onResume() {
    super.onResume();
    android.util.Log.d("Testing", "Resume");
    localMultiplayerView.resume();
}