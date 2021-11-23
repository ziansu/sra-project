protected javafx.scene.control.ListView<org.jimple.planner.task.Task> getFormattedList() {
    if ((listView) == null)
        return null;
    
    fitToAnchorPane(listView);
    return listView;
}