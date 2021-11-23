private void handleLoadMoreMsg() {
    footerViewLoading.setVisibility(View.GONE);
    adviceListView.setFooterDividersEnabled(true);
    footerViewLoadingVisible = false;
    isLoadingData = false;
    listViewAdapter.addData(updateItems);
    listViewAdapter.notifyDataSetChanged();
}