@java.lang.Override
public void onNewsUpdateFailed(java.lang.String section, java.lang.String message) {
    android.widget.Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
    mSwipeRefreshLayout.setRefreshing(false);
    loading = true;
}