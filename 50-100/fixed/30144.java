private void setRecyclerHeaderAdapterUpdate(com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersDecoration headerDecor) {
    listView.addItemDecoration(headerDecor);
    com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersTouchListener touchListener = new com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersTouchListener(listView, headerDecor);
    touchListener.setOnHeaderClickListener(new com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersTouchListener.OnHeaderClickListener() {
        @java.lang.Override
        public void onHeaderClick(android.view.View header, int position, long headerId) {
        }
    });
}