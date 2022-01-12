@java.lang.Override
public void onPause() {
    super.onPause();
    android.util.Log.d("NotesListFragment", "onPause");
    android.content.SharedPreferences.Editor prefEditor = android.preference.PreferenceManager.getDefaultSharedPreferences(activity).edit();
    prefEditor.putLong(com.nononsenseapps.notepad.NotesListFragment.SELECTEDIDKEY, mCurId);
    prefEditor.putString(com.nononsenseapps.notepad.NotesListFragment.SEARCHQUERYKEY, mSearchView.getQuery().toString());
    if (FragmentLayout.LANDSCAPE_MODE) {
        prefEditor.putBoolean(com.nononsenseapps.notepad.NotesListFragment.SHOWLISTKEY, false);
    }
    prefEditor.commit();
}