private int getPositionFromScrollProgress(float scrollProgress) {
    return ((int) (((mRecyclerView.getAdapter().getItemCount()) - 1) * scrollProgress));
}