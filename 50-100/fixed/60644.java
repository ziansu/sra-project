@java.lang.Override
public void onClick(android.view.View v) {
    remove(currentMessage);
    android.widget.Toast.makeText(((fragments.listview.ListViewSwipeToExecuteFragment.MySwipeContentViewHolder) (viewHolder)).itemView.getContext(), ((currentMessage.title) + " successfully deleted."), Toast.LENGTH_SHORT).show();
    notifySwipeExecuteFinished();
}