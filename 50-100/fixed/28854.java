@java.lang.Override
public android.database.Cursor loadInBackground() {
    int error = 1;
    if (isOnline(getApplicationContext()))
        error = com.givmed.android.HelperActivity.getNeedDataTask(db, pref);
    
    fillCursorsFromDb();
    hasInternet = error <= 0;
    if ((sortBy) == (SORT_BY_REGION))
        return mRegionCursor;
    else
        return mNameCursor;
    
}