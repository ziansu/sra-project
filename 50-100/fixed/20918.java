void run() {
    for (Task t : tasks)
        t.run();
    
    this.status = Status.RUNNING;
    if (debug)
        java.lang.System.out.println(((("running all the " + (tasks.size())) + " tasks from state ") + (this.name)));
    
}