@java.lang.Override
public void onClick(android.view.View v) {
    MainActivity.tm.deleteCompletedTask(cTaskList);
    cm.startTaskMenu();
}