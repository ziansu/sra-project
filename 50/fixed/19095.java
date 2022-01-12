public void setLastTask(TaskMessage tm) {
    if (tm != null) {
        tm.setConnection(this);
    }
    lastTask = tm;
}