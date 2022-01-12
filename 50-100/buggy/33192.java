@java.lang.Override
public com.example.raqib.instadate.MyNewsRecyclerViewAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    context = parent.getContext();
    com.example.raqib.instadate.MyNewsRecyclerViewAdapter.bookmarkNewsItems = new com.example.raqib.instadate.NewsItems();
    com.example.raqib.instadate.MyNewsRecyclerViewAdapter.bookmarkedNewsList = new java.util.ArrayList<com.example.raqib.instadate.NewsItems>();
    com.example.raqib.instadate.MyNewsRecyclerViewAdapter.bookmarkSharedPreference = context.getSharedPreferences("com.example.raqib.instadate", android.content.Context.MODE_PRIVATE);
    android.view.View view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_item, parent, false);
    return new com.example.raqib.instadate.MyNewsRecyclerViewAdapter.ViewHolder(view);
}