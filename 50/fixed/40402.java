public void executeTasks() {
    pj.pr.task.TargetTask<?> task = null;
    while ((task = this.getTask()) != null) {
        task.run();
    } 
}