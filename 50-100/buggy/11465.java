@java.lang.Override
public void onBindViewHolder(final com.cv4j.app.adapter.GridViewFilterAdapter.ViewHolder holder, int position) {
    java.lang.String filterName = mList.get(position);
    if (position == 0) {
        holder.image.setImageBitmap(mBitmap);
    }else {
        if (com.safframwork.tony.common.utils.Preconditions.isNotBlank(filterName)) {
            com.cv4j.core.filters.CommonFilter filter = ((com.cv4j.core.filters.CommonFilter) (getFilter(filterName)));
            com.cv4j.rxjava.RxImageData.bitmap(mBitmap).placeHolder(R.drawable.test_mm).addFilter(filter).into(holder.image);
        }
    }
    holder.text.setText(filterName);
}