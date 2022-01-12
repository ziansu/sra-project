@java.lang.Override
public void onSuggestionClicked(final com.arlib.floatingsearchview.suggestions.model.SearchSuggestion searchSuggestion) {
    android.util.Log.d(me.digi.examples.ca.MainActivity.TAG, "onSuggestionClicked()");
    mLastQuery = searchSuggestion.getBody();
    android.content.Intent i = new android.content.Intent(this, me.digi.examples.ca.ProfileActivity.class);
    i.putExtra("name", mLastQuery);
    startActivity(i);
}