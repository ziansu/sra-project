public void stopKiTasks() {
    if ((softKiTask) != null)
        softKiTask.cancel(true);
    
    if ((mediumKiTask) != null)
        mediumKiTask.cancel(true);
    
    if ((hardKiTask) != null)
        hardKiTask.cancel(true);
    
}