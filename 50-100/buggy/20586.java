public void update() throws java.io.IOException {
    this.newTasks.clear();
    this.currentTasklist.update();
    for (droplauncher.util.windows.Task currTask : this.currentTasklist.getTasks()) {
        if (!(this.previousTasklist.getTasks().contains(currTask))) {
            this.newTasks.add(currTask);
        }
    }
    this.previousTasklist.update();
}