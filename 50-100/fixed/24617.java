@java.lang.Override
public void onBindViewHolder(final android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    if (mLegacyBindViewMode) {
        if (mVerbose) {
            android.util.Log.v(com.mikepenz.fastadapter.FastAdapter.TAG, (((("onBindViewHolderLegacy: " + position) + "/") + (holder.getItemViewType())) + " isLegacy: true"));
        }
        holder.itemView.setTag(R.id.fastadapter_item_adapter, this);
        mOnBindViewHolderListener.onBindViewHolder(holder, position, java.util.Collections.EMPTY_LIST);
    }
}