@java.lang.Override
public void onDestroy() {
    android.util.Log.e("ViewGroup", "Destroy!");
    pagerAdapter.removeAllfragments();
    orientationHandler.stop();
    super.onDestroy();
}