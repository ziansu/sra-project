public void toggleSelection(int position) {
    if (mSelectedItems.contains(position)) {
        mSelectedItems.remove(mSelectedItems.indexOf(position));
    }else {
        mSelectedItems.add(position);
    }
}