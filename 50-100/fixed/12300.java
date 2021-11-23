@java.lang.Override
public void onItemClick(int viewId, int position) {
    switch (viewId) {
        case R.id.task_card_text_open :
            if (position >= 0) {
                mTaskRecyclerAdapter.getItems().remove(position);
                mTaskRecyclerAdapter.notifyItemRemoved(position);
            }
            break;
        case R.id.task_card_text :
            mTaskRecyclerAdapter.getItems().set(position, new com.org.runaway.sharetodo.data.TaskState.AssignedTaskState());
            mTaskRecyclerAdapter.notifyItemChanged(position);
            break;
        default :
            break;
    }
}