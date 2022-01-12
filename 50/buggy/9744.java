@java.lang.Override
public void onItemDismiss(int position) {
    mTaskList.remove(position);
    notifyItemRemoved(position);
}