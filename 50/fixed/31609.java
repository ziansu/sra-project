public void loadTasks() {
    clear();
    context.getFireBaseHandler().getTasks();
    notifyDataChangedListenerers();
}