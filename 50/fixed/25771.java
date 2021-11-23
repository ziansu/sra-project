@java.lang.Override
public com.github.geekarist.mine.list.StuffViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_view_stuff_item, parent, false);
    return new com.github.geekarist.mine.list.StuffViewHolder(view);
}