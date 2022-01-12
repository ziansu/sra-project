@java.lang.Override
public void onBindViewHolder(org.lvu.adapter.BaseListAdapter.ViewHolder holder, int position) {
    super.onBindViewHolder(holder, position);
    if (mData.isEmpty())
        return ;
    
    holder.image.setImageBitmap(mData.get(((position != 0) && (position >= (mData.size())) ? (mData.size()) - 1 : position)).getBitmap());
}