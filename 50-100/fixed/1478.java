public void runTimer(long now) {
    java.util.Iterator<com.hawky.jhttpload.Task> itr = tasks.values().iterator();
    while (itr.hasNext()) {
        com.hawky.jhttpload.Task task = itr.next();
        if ((task.execTimeMillis) > now) {
            break;
        }
        task.proc.run(task.associatedData, now);
        itr.remove();
        if (task.periodic) {
            task.execTimeMillis += task.intervalMillis;
            this.submitTask(task);
        }
    } 
}