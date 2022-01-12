private void populateOverdueList(java.util.ArrayList<main.java.data.Task> searchResult) {
    overdueTableControl.clearTask();
    int count = 1;
    for (main.java.data.Task temp : searchResult) {
        if ((searchResult.size()) == 1) {
            count = 999;
        }
        if ((temp.getStatus()) == (main.java.data.TASK_STATUS.OVERDUE)) {
            overdueTableControl.addTask(temp, (count++));
        }
    }
}