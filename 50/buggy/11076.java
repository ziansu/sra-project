private void populateList(main.java.gui.TasksTableController tableControl, java.util.ArrayList<main.java.data.Task> result) {
    int count = 1;
    tableControl.clearTask();
    for (main.java.data.Task temp : result) {
        tableControl.addTask(temp, (count++));
    }
}