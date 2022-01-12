@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    if (!((query.isEmpty()) || (query.equals(lastQuery)))) {
        lastQuery = query;
        mArtistAdapter.clear();
        new com.bmriv.android.streamify.QueryArtistTask(mArtistAdapter, mToast).execute(query);
    }
    return true;
}