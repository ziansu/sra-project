@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int whichButton) {
    java.lang.String newgroup = inputowner.getText().toString();
    java.lang.String newowner = inputgroup.getText().toString();
    dialog.dismiss();
    if (((newgroup.length()) > 1) && ((newowner.length()) > 1)) {
        final com.dnielfe.manager.tasks.GroupOwnerTask task = new com.dnielfe.manager.tasks.GroupOwnerTask(a, newgroup, newowner);
        task.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, com.dnielfe.manager.dialogs.GroupOwnerDialog.file);
    }
}