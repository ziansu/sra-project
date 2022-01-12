protected void onBindItemViewHolder(com.e16din.simplerecycler.adapter.holders.SimpleViewHolder holder, int position) {
    updateItemClickListener(position, ((holder.vFirstChild) != null ? holder.vFirstChild : holder.itemView));
}