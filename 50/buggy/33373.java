public void removeTask(int index) {
    this.makespan -= taskList.get(index).getDuration();
    taskList.remove(index);
}