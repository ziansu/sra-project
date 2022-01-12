@java.lang.Override
public void OnRefreshFinished() {
    pbLoading.setVisibility(View.GONE);
    if ((layoutManagerSavedState) != null) {
        recyclerView.getLayoutManager().onRestoreInstanceState(layoutManagerSavedState);
        layoutManagerSavedState = null;
    }
}