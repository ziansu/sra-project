public void loadFirstPageAndScrollToTop() {
    com.bumptech.glide.Glide.get(getActivity()).clearMemory();
    gov.anzong.meizi.MeiziListViewUtils.smoothScrollListViewToTop(mAdapterView);
    loadFirstPage();
}