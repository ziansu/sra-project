private int getPositionFromScrollProgress(float scrollProgress) {
    return ((int) ((mRecyclerView.getAdapter().getItemCount()) * scrollProgress));
}