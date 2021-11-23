public void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    if (savedInstanceState != null) {
        super.onRestoreInstanceState(savedInstanceState);
        parentSelected = savedInstanceState.getBoolean(eu.davidea.flexibleadapter.FlexibleAdapter.EXTRA_PARENT);
        childSelected = savedInstanceState.getBoolean(eu.davidea.flexibleadapter.FlexibleAdapter.EXTRA_CHILD);
        headersShown = savedInstanceState.getBoolean(eu.davidea.flexibleadapter.FlexibleAdapter.EXTRA_HEADERS);
        if (headersShown)
            showAllHeaders();
        
    }
}