@java.lang.Override
public void onSaveInstanceState(android.os.Bundle saveState) {
    super.onSaveInstanceState(saveState);
    android.util.Log.i(LOG_TAG, "Saving instances before destroying the activity");
    if ((movieArrayList) != null)
        saveState.putParcelableArrayList(SAVED_MOVIE_LIST, movieArrayList);
    
    saveState.putString(SAVED_SORT_PREF, sortBy);
    saveState.putInt(SAVED_PAGE_NO, page);
}