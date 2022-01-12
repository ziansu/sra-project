@java.lang.Override
public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    dispalySnackBar(viewHolder.getAdapterPosition());
    list.remove(viewHolder.getAdapterPosition());
    adapter.notifyItemRemoved(viewHolder.getAdapterPosition());
}