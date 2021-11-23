@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    android.util.Log.d(LOG_TAG, (" " + resultCode));
    if (resultCode == (android.app.Activity.RESULT_OK)) {
        android.util.Log.d(LOG_TAG, "resultCode == Activity.RESULT_OK");
        edu.depaul.csc595.jarvis.detection.SmartProductListFragment fragment = ((edu.depaul.csc595.jarvis.detection.SmartProductListFragment) (getFragmentManager().findFragmentById(R.id.list_fragment)));
        fragment.updateSmartProducts();
    }
}