private void setSearch() {
    java.lang.String searchtype = "";
    if (searchLanguage) {
        searchtype = getString(R.string.github_language);
    }else {
        searchtype = getString(R.string.github_searchterm);
    }
    search.setText(((searchtype + " ") + (searchTag)));
}