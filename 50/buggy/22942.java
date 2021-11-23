@java.lang.Override
public void onClick(android.view.View v) {
    if ((currentTask) != null) {
        currentTask = stopTask(activity);
    }else {
        currentTask = startTask(activity);
    }
}