@java.lang.Override
public void onClick(android.view.View view) {
    com.leosko.todotxt_gdrive.TaskEditDialog ted = new com.leosko.todotxt_gdrive.TaskEditDialog(this, null);
    android.app.AlertDialog.Builder builder = ted.createTaskCreationDialog();
    final android.app.AlertDialog alertD = builder.create();
    alertD.show();
}