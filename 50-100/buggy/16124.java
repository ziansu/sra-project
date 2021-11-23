@java.lang.Override
public void onActionError(java.lang.Throwable throwable) {
    swipeRefreshLayout.setRefreshing(false);
    android.widget.Toast.makeText(this.getActivity(), (((((getResources().getString(R.string.rating_list_load_error)) + "\n") + throwable) + "\n") + (throwable.getMessage())), Toast.LENGTH_SHORT).show();
}