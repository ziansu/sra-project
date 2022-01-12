protected boolean hasMoreData() {
    if ((getTotalCount()) < 0) {
        return true;
    }
    return ((getTotalCount()) > 0) && ((getItemCount()) < (getTotalCount()));
}