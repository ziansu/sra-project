@java.lang.Override
public void onSelection(org.chromium.chrome.browser.omnibox.OmniboxSuggestion suggestion, int position) {
    mSuggestionSelectionInProgress = true;
    java.lang.String suggestionMatchUrl = updateSuggestionUrlIfNeeded(suggestion, position, false);
    loadUrlFromOmniboxMatch(suggestionMatchUrl, suggestion.getTransition(), position, suggestion.getType());
    hideSuggestions();
    org.chromium.ui.UiUtils.hideKeyboard(mUrlBar);
}