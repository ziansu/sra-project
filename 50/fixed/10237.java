private void handleLoadMoreMsg() {
    footerViewLoading.setVisibility(View.GONE);
    footerViewLoadingVisible = false;
    isLoadingData = false;
    listViewAdapter.addData(updateItems);
    listViewAdapter.notifyDataSetChanged();
}