@java.lang.Override
public RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    final android.view.View view = inflater.inflate(R.layout.newslist_itemlayout, parent, false);
    view.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            if ((itemListener) != null)
                itemListener.onItemClick(v, ((int) (v.getTag())));
            
        }
    });
    return new com.java.zu26.newsList.NewsListFragment.ItemViewHolder(view);
}