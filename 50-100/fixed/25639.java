@java.lang.Override
public boolean onQueryTextChange(java.lang.String text) {
    if ((text.isEmpty()) || (disableAutoComplete)) {
        setAutoCompleteAdapterIcon(autoCompleteIconResourceId);
        disableAutoComplete = false;
        return false;
    }else
        if ((text.length()) < 3) {
            setAutoCompleteAdapterIcon(recentSearchIconResourceId);
            loadSavedSearches();
        }else {
            setAutoCompleteAdapterIcon(autoCompleteIconResourceId);
            fetchAutoCompleteSuggestions(text);
        }
    
    return false;
}