@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ((android.widget.ImageView) (this.findViewById(R.id.refresh))).setOnClickListener(refreshJson);
    searchList = ((se.emilsjolander.stickylistheaders.StickyListHeadersListView) (findViewById(R.id.sticky_list)));
    se.tuppload.android.satstrainingapp.RequestJson.getJsonData(searchList, this);
    searchList.setOnStickyHeaderChangedListener(new se.emilsjolander.stickylistheaders.StickyListHeadersListView.OnStickyHeaderChangedListener() {
        @java.lang.Override
        public void onStickyHeaderChanged(se.emilsjolander.stickylistheaders.StickyListHeadersListView stickyListHeadersListView, android.view.View view, int i, long l) {
        }
    });
}