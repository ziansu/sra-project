@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    getTasks().remove(itemPosition);
    tasksDB.deleteTask(getTasks().get(itemPosition));
    getAdapter().notifyDataSetChanged();
    return true;
}