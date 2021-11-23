public void setSuggestionAdapter(vn.eazy.tagview.adapter.SuggestionAdapter suggestionAdapter) {
    this.suggestionAdapter = suggestionAdapter;
    if ((suggestionWindow) != null) {
        suggestionWindow.setAdapter(suggestionAdapter);
    }
}