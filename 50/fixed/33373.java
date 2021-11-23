public void removeTask(int index) {
    this.makespan -= taskList.get(index).getDuration();
    this.taskList.remove(index);
}