@java.lang.Override
public void done(java.util.List<experties.com.handytask.models.ParseTask> parseTasksAll, experties.com.handytask.activities.ParseException e) {
    parseTasks = ((java.util.ArrayList) (parseTasksAll));
    if ((((currentLatLng) != null) && ((parseTasks) != null)) && ((parseTasks.size()) > 0)) {
        calculateRelativeDistance();
        java.util.Collections.sort(parseTasks, ParseTask.relDistComparator);
        showOnListFragment.updateTasksList();
        showOnMapFragment.updateTasksList();
    }
}