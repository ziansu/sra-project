@java.lang.Override
public void onActivityCreated(com.android.contacts.list.Bundle savedInstanceState) {
    if (DEBUG)
        android.util.Log.d(com.android.contacts.list.PluginContactBrowseListFragment.TAG, "onActivityCreated");
    
    super.onActivityCreated(savedInstanceState);
    mPrefs = getActivity().getSharedPreferences(mPrefsFileName, Context.MODE_PRIVATE);
    updatePluginView();
    restoreFilter();
    restoreSelectedUri(false);
}