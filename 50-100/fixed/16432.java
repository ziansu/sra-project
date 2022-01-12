@java.lang.SuppressWarnings(value = "unused")
public void onEventMainThread(org.wordpress.android.ui.suggestion.service.SuggestionEvents.SuggestionNameListUpdated event) {
    if ((((event.mRemoteBlogId) != 0) && ((event.mRemoteBlogId) == (mRemoteBlogId))) && ((mSuggestionAdapter) != null)) {
        java.util.List<org.wordpress.android.models.Suggestion> suggestions = org.wordpress.android.datasets.SuggestionTable.getSuggestionsForSite(event.mRemoteBlogId);
        mSuggestionAdapter.setSuggestionList(suggestions);
    }
}