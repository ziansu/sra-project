public void loadTasks() {
    tasks.clear();
    context.getFireBaseHandler().getTasks();
    notifyDataChangedListenerers();
}