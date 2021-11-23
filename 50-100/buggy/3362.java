@java.lang.Override
public void showProgress(java.lang.String message) {
    tvResEmptyState.setVisibility(View.GONE);
    tvWestEmptyState.setVisibility(View.GONE);
    tvUnionEmptyState.setVisibility(View.GONE);
    resMenu.setVisibility(View.GONE);
    westMenu.setVisibility(View.GONE);
    unionMenu.setVisibility(View.GONE);
    resProgressBar.setVisibility(View.VISIBLE);
    westProgressBar.setVisibility(View.VISIBLE);
    unionProgressBar.setVisibility(View.VISIBLE);
}