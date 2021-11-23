@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.util.Log.e("ViewGroup", "Destroy!");
    pagerAdapter.removeAllfragments();
    orientationHandler.stop();
}