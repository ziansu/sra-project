protected void addTasksToFormattedList() {
    for (org.jimple.planner.task.Task task : arrList) {
        formattedList.add(task);
    }
    data = javafx.collections.FXCollections.observableArrayList(formattedList);
    listView = new javafx.scene.control.ListView<org.jimple.planner.task.Task>(data);
    if (formattedList.isEmpty())
        listView = null;
    
}