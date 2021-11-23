private boolean isFooterView(int position) {
    return ((mOpenLoadMore) && ((getItemCount()) > 1)) && (position >= ((getItemCount()) - 1));
}