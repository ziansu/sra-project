@java.lang.Override
public void onSuggestionClicked(final com.arlib.floatingsearchview.suggestions.model.SearchSuggestion searchSuggestion) {
    me.digi.examples.ca.searchData.ColorSuggestion colorSuggestion = ((me.digi.examples.ca.searchData.ColorSuggestion) (searchSuggestion));
    me.digi.examples.ca.searchData.DataHelper.findColors(getApplicationContext(), colorSuggestion.getBody(), new me.digi.examples.ca.searchData.DataHelper.OnFindColorsListener() {
        @java.lang.Override
        public void onResults(java.util.List<me.digi.examples.ca.searchData.ColorWrapper> results) {
        }
    });
    android.util.Log.d(me.digi.examples.ca.MainActivity.TAG, "onSuggestionClicked()");
    mLastQuery = searchSuggestion.getBody();
    android.content.Intent i = new android.content.Intent(this, me.digi.examples.ca.ProfileActivity.class);
    i.putExtra("name", mLastQuery);
    startActivity(i);
}