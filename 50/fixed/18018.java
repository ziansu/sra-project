public void setupFeed() {
    android.support.v7.widget.LinearLayoutManager linearLayoutManager = new android.support.v7.widget.LinearLayoutManager(getActivity()) {
        @java.lang.Override
        protected int getExtraLayoutSpace(android.support.v7.widget.RecyclerView.State state) {
            return 300;
        }
    };
    rvFeed.setLayoutManager(linearLayoutManager);
    updateRecyclerView();
}