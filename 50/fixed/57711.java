private boolean isFooterView(int position) {
    return (mOpenLoadMore) && (position >= ((getItemCount()) - 1));
}