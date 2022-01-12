public void setItemSelected(int pos, boolean selected, android.view.View view) {
    if ((pos > 0) && (pos < (mAdapter.getItemCount()))) {
        if (selected) {
            mSelectedItems.put(pos, selected);
            view.setSelected(true);
        }else {
            mSelectedItems.delete(pos);
            view.setSelected(false);
        }
    }
}