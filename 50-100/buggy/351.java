private void updateHeader(int headerPosition, boolean updateHeaderContent) {
    if ((mHeaderPosition) != headerPosition) {
        mHeaderPosition = headerPosition;
        android.support.v7.widget.RecyclerView.ViewHolder holder = getHeaderViewHolder(headerPosition);
        if ((mStickyHeaderViewHolder) != holder) {
            if (eu.davidea.flexibleadapter.FlexibleAdapter.DEBUG)
                android.util.Log.v(eu.davidea.flexibleadapter.helpers.StickyHeaderHelper.TAG, ("swapHeader newPosition=" + headerPosition));
            
            swapHeader(holder);
        }
    }else
        if (updateHeaderContent && ((mStickyHeaderViewHolder) != null)) {
            mAdapter.onBindViewHolder(mStickyHeaderViewHolder, mHeaderPosition);
            ensureHeaderParent();
        }
    
    translateHeader();
}