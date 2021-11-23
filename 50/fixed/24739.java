public boolean expandParent(int parentPosition) {
    int parentAdapterPosition = getParentAdapterPosition(parentPosition);
    return (parentAdapterPosition != (android.support.v7.widget.RecyclerView.NO_POSITION)) && (expandViews(parentAdapterPosition, true));
}