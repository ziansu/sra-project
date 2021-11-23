public void deleteitem() {
    if ((openPosution) != (-1)) {
        mDataset.remove(openPosution);
        mDataHashMap.remove(mDataset.get(openPosution));
        notifyItemRemoved(openPosution);
        notifyItemRangeChanged(openPosution, mDataset.size());
        mItemManger.closeAllItems();
        openPosution = -1;
    }
}