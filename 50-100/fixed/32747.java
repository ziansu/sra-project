public void deleteitem() {
    if ((openPosution) != (-1)) {
        mDataHashMap.remove(mDataset.get(openPosution));
        mDataset.remove(openPosution);
        notifyItemRemoved(openPosution);
        notifyItemRangeChanged(openPosution, mDataset.size());
        mItemManger.closeAllItems();
        openPosution = -1;
    }
}