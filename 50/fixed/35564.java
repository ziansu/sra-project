void startReordering(int position) {
    mReorderPosition = position;
    mDropPosition = position;
    if ((decoratedAdapter) != null)
        decoratedAdapter.notifyItemChanged(position);
    
}