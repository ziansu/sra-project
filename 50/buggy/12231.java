@java.lang.Override
public com.wenjiehe.xingji.RecyclerViewAdapter.NewsViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
    android.view.View v = android.view.LayoutInflater.from(context).inflate(R.layout.recyclerview_sign_item_info, viewGroup, false);
    com.wenjiehe.xingji.RecyclerViewAdapter.NewsViewHolder nvh = new com.wenjiehe.xingji.RecyclerViewAdapter.NewsViewHolder(v);
    return nvh;
}