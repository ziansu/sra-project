public void setLookup(com.nikit.bobin.wordstranslate.translating.models.WordLookup lookup) {
    com.nikit.bobin.wordstranslate.helpers.Ensure.inUiThread();
    currentLookup = lookup;
    if (lookupList.isShown()) {
        int visibility = (lookup.isEmpty()) ? GONE : VISIBLE;
        lookupList.setVisibility(visibility);
        yandexDictionaryLabel.setVisibility(visibility);
    }else {
        lookupList.setVisibility(com.nikit.bobin.wordstranslate.customviews.INVISIBLE);
        yandexDictionaryLabel.setVisibility(com.nikit.bobin.wordstranslate.customviews.INVISIBLE);
    }
    adapter.setNewLookup(lookup);
    lookupList.invalidateViews();
}