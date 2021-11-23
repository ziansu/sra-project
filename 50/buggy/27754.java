@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    tasksDB.deleteTask(getTasks().get(itemPosition));
    getTasks().remove(itemPosition);
    getAdapter().notifyDataSetChanged();
    return true;
}