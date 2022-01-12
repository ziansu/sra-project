public void onSaveInstanceState(android.os.Bundle outState) {
    if (outState != null) {
        super.onSaveInstanceState(outState);
        outState.putBoolean(eu.davidea.flexibleadapter.FlexibleAdapter.EXTRA_CHILD, this.childSelected);
        outState.putBoolean(eu.davidea.flexibleadapter.FlexibleAdapter.EXTRA_PARENT, this.parentSelected);
        outState.putInt(eu.davidea.flexibleadapter.FlexibleAdapter.EXTRA_LEVEL, this.selectedLevel);
        outState.putString(eu.davidea.flexibleadapter.FlexibleAdapter.EXTRA_SEARCH, this.mSearchText);
        outState.putString(eu.davidea.flexibleadapter.FlexibleAdapter.EXTRA_SEARCH_OLD, this.mOldSearchText);
        outState.putBoolean(eu.davidea.flexibleadapter.FlexibleAdapter.EXTRA_HEADERS, this.headersShown);
    }
}