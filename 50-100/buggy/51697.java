private void syncTaskList() {
    android.support.v4.app.FragmentManager man = this.getSupportFragmentManager();
    com.therewillbebugs.todolist.TaskListFragment frag = ((com.therewillbebugs.todolist.TaskListFragment) (man.findFragmentByTag(TaskListFragment.TAG)));
    if (frag != null) {
        android.util.Log.d("taskActivity", ("sync size: " + (taskManager.size())));
        frag.refreshRecyclerList(taskManager.getTaskList());
    }else
        android.widget.Toast.makeText(this, "Error couldn't refresh", Toast.LENGTH_SHORT).show();
    
}