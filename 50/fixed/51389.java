private void prepareLanguageListData() {
    mLanguages = new java.util.ArrayList<>();
    for (java.lang.String lang : fileSystem.extractLangNames()) {
        mLanguages.add(lang);
    }
}