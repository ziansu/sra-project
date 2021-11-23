@java.lang.Override
public void run() {
    if ((task.getStatus()) == (AsyncTask.Status.RUNNING))
        task.cancel(true);
    
    failed = true;
    refresh();
}