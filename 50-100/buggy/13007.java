@java.lang.Override
protected void onResume() {
    super.onResume();
    android.support.v4.app.Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.list_container);
    if ((!(mTwoPane)) && (fragment instanceof com.qualicom.availabilitydashboard.NodeListActivityFragment)) {
        android.util.Log.i("BACK", "Back to node fragment");
        selectedNode = null;
    }
}