@java.lang.Override
public void onbindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    com.stickheaderlayout.simple.RecyclerViewSimpleActivity.RecyclerAdapter.RecyclerItemViewHolder viewHolder = ((com.stickheaderlayout.simple.RecyclerViewSimpleActivity.RecyclerAdapter.RecyclerItemViewHolder) (holder));
    viewHolder.tvTitle.setText(mItemList.get(position));
}