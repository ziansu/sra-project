private void showProgressBar(boolean visible) {
    com.kevinlamcs.android.restaurando.ui.activity.SearchActivity searchActivity = ((com.kevinlamcs.android.restaurando.ui.activity.SearchActivity) (getActivity()));
    if (visible) {
        if (searchActivity != null) {
            circularProgressBar.setVisibility(View.VISIBLE);
            searchActivity.getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        }
    }else {
        if (searchActivity != null) {
            searchActivity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            circularProgressBar.setVisibility(View.GONE);
        }
    }
}