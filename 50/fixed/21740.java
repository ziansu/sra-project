@java.lang.Override
public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int swipeDir) {
    int id = ((int) (viewHolder.itemView.getTag()));
    deleteEntry(id);
}