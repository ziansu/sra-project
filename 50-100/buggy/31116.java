@java.lang.Override
public com.ringsterz.androidtextreader.adapter.RecyclerViewAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    mContext = parent.getContext();
    com.ringsterz.androidtextreader.adapter.RecyclerViewAdapter.bibleManager = com.ringsterz.androidtextreader.BibleManager.getInstance(parent.getContext());
    android.view.View v = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.swipe_context_menu, parent, false);
    com.ringsterz.androidtextreader.adapter.RecyclerViewAdapter.ViewHolder vh = new com.ringsterz.androidtextreader.adapter.RecyclerViewAdapter.ViewHolder(v);
    return vh;
}