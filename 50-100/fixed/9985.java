public void setItemSelected(int pos, boolean selected, android.view.View view) {
    if ((pos < 0) || (pos >= (mAdapter.getItemCount())))
        return ;
    
    if (selected) {
        mSelectedItems.put(pos, selected);
    }else {
        mSelectedItems.delete(pos);
    }
    view.setSelected(selected);
}