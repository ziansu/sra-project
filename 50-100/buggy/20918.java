void run() {
    for (Task t : tasks) {
        t.run();
        if (get_name().equals("END_ROOT"))
            p.println(("executing" + t));
        
    }
    this.status = Status.RUNNING;
    if (debug)
        java.lang.System.out.println(((("running all the " + (tasks.size())) + " tasks from state ") + (this.name)));
    
}