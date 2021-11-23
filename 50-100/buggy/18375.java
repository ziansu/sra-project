private void showProgressBar(boolean visible) {
    com.kevinlamcs.android.restaurando.ui.activity.SearchActivity searchActivity = ((com.kevinlamcs.android.restaurando.ui.activity.SearchActivity) (getActivity()));
    if (visible) {
        circularProgressBar.setVisibility(View.VISIBLE);
        searchActivity.getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }else {
        searchActivity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        circularProgressBar.setVisibility(View.GONE);
    }
}