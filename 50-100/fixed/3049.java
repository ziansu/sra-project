public int getActualItemViewType(int position) {
    final android.database.Cursor cursor = ((android.database.Cursor) (super.getItem(position)));
    if ((cursor == null) || ((mIndices) == null))
        throw new java.lang.NullPointerException();
    
    switch (cursor.getString(mIndices.type)) {
        case Suggestions.Search.TYPE_SAVED_SEARCH :
            {
                return org.mariotaku.twidere.activity.support.QuickSearchBarActivity.SuggestionsAdapter.VIEW_TYPE_SAVED_SEARCH;
            }
        case Suggestions.Search.TYPE_SCREEN_NAME :
            {
                return org.mariotaku.twidere.activity.support.QuickSearchBarActivity.SuggestionsAdapter.VIEW_TYPE_USER_SCREEN_NAME;
            }
        case Suggestions.Search.TYPE_SEARCH_HISTORY :
            {
                return org.mariotaku.twidere.activity.support.QuickSearchBarActivity.SuggestionsAdapter.VIEW_TYPE_SEARCH_HISTORY;
            }
        case Suggestions.Search.TYPE_USER :
            {
                return org.mariotaku.twidere.activity.support.QuickSearchBarActivity.SuggestionsAdapter.VIEW_TYPE_USER_SUGGESTION_ITEM;
            }
    }
    return IGNORE_ITEM_VIEW_TYPE;
}