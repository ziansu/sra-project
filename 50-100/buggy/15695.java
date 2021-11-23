@java.lang.Override
public void onClick(android.view.View v) {
    int pos = getAdapterPosition();
    if (pos == (android.support.v7.widget.RecyclerView.NO_POSITION))
        return ;
    
    mFrame.setSelected((!(mFrame.isSelected())));
    updateTitleColor();
    com.mapswithme.maps.search.HotelsTypeAdapter.Item item = mItems.get(pos);
    item.mSelected = mFrame.isSelected();
    if ((mListener) != null)
        mListener.onTypeSelected(item.mSelected, item.mType);
    
}