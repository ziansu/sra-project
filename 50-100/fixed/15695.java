@java.lang.Override
public void onClick(android.view.View v) {
    int position = getAdapterPosition();
    if (position == (android.support.v7.widget.RecyclerView.NO_POSITION))
        return ;
    
    mFrame.setSelected((!(mFrame.isSelected())));
    updateTitleColor();
    com.mapswithme.maps.search.HotelsTypeAdapter.Item item = mItems.get(position);
    item.mSelected = mFrame.isSelected();
    if ((mListener) != null)
        mListener.onTypeSelected(item.mSelected, item.mType);
    
}