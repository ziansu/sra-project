public void showRefreshFooter() {
    mListStatusView.findViewById(R.id.tvRepeatButton).setVisibility(View.VISIBLE);
    mListStatusView.findViewById(R.id.progressBar).setVisibility(View.GONE);
    mListStatusView.findViewById(R.id.tvEmptyMessage).setVisibility(View.GONE);
    if ((mListView.getFooterViewsCount()) == 0) {
        mListView.addFooterView(mListStatusView);
        mListView.setFooterDividersEnabled(false);
    }
}