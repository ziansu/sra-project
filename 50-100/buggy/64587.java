@java.lang.Override
public boolean onMove(android.support.v7.widget.RecyclerView recyclerView, android.support.v7.widget.RecyclerView.ViewHolder viewHolder, android.support.v7.widget.RecyclerView.ViewHolder target) {
    int src = viewHolder.getAdapterPosition();
    int dest = target.getAdapterPosition();
    mAdapter.moveShooter(getContext(), src, dest);
    mAdapter.notifyItemMoved(src, dest);
    mAdapter.notifyItemChanged(src);
    mAdapter.notifyItemChanged(dest);
    return true;
}