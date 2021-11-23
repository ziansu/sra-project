public void setLastTask(TaskMessage tm) {
    tm.setConnection(this);
    lastTask = tm;
}