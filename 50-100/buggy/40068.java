private void setRecyclerHeaderAdapterUpdate(final com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersDecoration headerDecor) {
    listView.addItemDecoration(headerDecor);
    listView.addItemDecoration(new nu.yona.app.recyclerViewDecor.DividerDecoration(getActivity()));
    com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersTouchListener touchListener = new com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersTouchListener(listView, headerDecor);
    touchListener.setOnHeaderClickListener(new com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersTouchListener.OnHeaderClickListener() {
        @java.lang.Override
        public void onHeaderClick(android.view.View header, int position, long headerId) {
        }
    });
    perDayStickyAdapter.registerAdapterDataObserver(new android.support.v7.widget.RecyclerView.AdapterDataObserver() {
        @java.lang.Override
        public void onChanged() {
            headerDecor.invalidateHeaders();
        }
    });
}