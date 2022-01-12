public void setAllItemsEnabled(boolean isAllEnabled) {
    this.isAllEnabled = isAllEnabled;
    int i = (rows.size()) + 2;
    while (i < (getItemCount())) {
        notifyItemRangeChanged(i, rows.size());
        i += (rows.size()) + 1;
    } 
}