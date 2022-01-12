@java.lang.Override
public RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    if (viewType == (com.joany.news.adapter.RecyclerViewAdapter.TYPE_ITEM)) {
        android.view.View v = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_news_list_item, parent, false);
        com.joany.news.adapter.RecyclerViewAdapter.ItemViewHolder ivh = new com.joany.news.adapter.RecyclerViewAdapter.ItemViewHolder(v);
        return ivh;
    }else {
        android.view.View v = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.footer, parent, false);
        return new com.joany.news.adapter.RecyclerViewAdapter.FooterViewHolder(v);
    }
}