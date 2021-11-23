private void setSearch() {
    java.lang.String searchtype;
    if (searchLanguage) {
        searchtype = getString(R.string.github_language);
    }else {
        searchtype = getString(R.string.github_searchterm);
    }
    java.lang.String text = (searchtype + " ") + (searchTag);
    search.setText(text);
}