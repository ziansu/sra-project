public void setLookup(com.nikit.bobin.wordstranslate.translating.models.WordLookup lookup) {
    com.nikit.bobin.wordstranslate.helpers.Ensure.inUiThread();
    currentLookup = lookup;
    int visibility = (lookup.isEmpty()) ? GONE : VISIBLE;
    lookupList.setVisibility(visibility);
    yandexDictionaryLabel.setVisibility(visibility);
    adapter.setNewLookup(lookup);
    lookupList.invalidateViews();
}