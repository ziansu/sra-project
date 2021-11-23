@java.lang.Override
protected void onSetupUiState() {
    android.util.Log.d(com.ayuget.redface.ui.TopicsActivity.LOG_TAG, "Setting up initial state for TopicsActivity");
    defaultFragment = com.ayuget.redface.ui.fragment.DefaultFragment.newInstance();
    getSupportFragmentManager().beginTransaction().replace(R.id.container, defaultFragment, com.ayuget.redface.ui.TopicsActivity.DEFAULT_FRAGMENT_TAG).commit();
}