@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    java.lang.String last_sort_by = mCurrSortBy;
    switch (item.getItemId()) {
        case R.id.action_sortby_popularity :
            {
                mCurrSortBy = TheMovieDBAPI.SORTBY_POPULARITY;
                break;
            }
        case R.id.action_sortby_rating :
            {
                mCurrSortBy = TheMovieDBAPI.SORTBY_RATING;
                break;
            }
        default :
            {
                return false;
            }
    }
    if (!(mCurrSortBy.equals(last_sort_by))) {
        update_main_movies();
    }
    return true;
}