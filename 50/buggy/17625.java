@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.d("onResume", category);
    setUserVisibleHint(true);
}