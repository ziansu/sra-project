@java.lang.Override
public void onClick(android.view.View view) {
    task.setStatus(Task.STATUS_UNFINISHED);
    setTextFor(R.id.txt_share_task_edit_status, com.example.vietnguyen.models.Task.STATUS[com.example.vietnguyen.models.Task.STATUS_UNFINISHED]);
    task.save();
}