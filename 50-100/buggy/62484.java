@java.lang.Override
public void onCreateContextMenu(android.view.ContextMenu menu, android.view.View v, android.view.ContextMenu.ContextMenuInfo menuInfo) {
    if ((mContext) instanceof com.appers.ayvaz.thetravelingsalesman.TaskListActivity) {
        ((android.app.Activity) (mContext)).getMenuInflater().inflate(R.menu.menu_task_context, menu);
        menu.setHeaderTitle(mTask.getTitle());
    }
    mSelected = getAdapterPosition();
    android.util.Log.i(DEBUG_TAG, ("selected: " + (mSelected)));
}