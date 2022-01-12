@java.lang.Override
public void onBindViewHolder(org.lvu.adapter.BaseListAdapter.ViewHolder holder, int position) {
    holder.image.setImageBitmap(mData.get((position >= (mData.size()) ? (mData.size()) - 1 : position)).getBitmap());
    super.onBindViewHolder(holder, position);
}