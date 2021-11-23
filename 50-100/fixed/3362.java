@java.lang.Override
public void showProgress(java.lang.String message) {
    tvWestEmptyState.setVisibility(View.GONE);
    tvUnionEmptyState.setVisibility(View.GONE);
    westMenu.setVisibility(View.GONE);
    unionMenu.setVisibility(View.GONE);
    westProgressBar.setVisibility(View.VISIBLE);
    unionProgressBar.setVisibility(View.VISIBLE);
}