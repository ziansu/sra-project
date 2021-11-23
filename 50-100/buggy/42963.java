private void addUpcomingTasksToFormattedDateList() {
    for (org.jimple.planner.task.Task task : arrList) {
        if ((org.jimple.planner.ui.UiFormatter.timeDifference(task.getFromTime())) > 0) {
            formattedList.add(task);
            break;
        }
    }
    data = javafx.collections.FXCollections.observableArrayList(formattedList);
    listView = new javafx.scene.control.ListView<org.jimple.planner.task.Task>(data);
    if (formattedList.isEmpty())
        listView = null;
    
}