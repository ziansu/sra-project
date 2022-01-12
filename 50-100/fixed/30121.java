public javafx.collections.ObservableList<com.nexus.simplify.database.tasktype.DeadlineTask> getObservable() {
    int maxNumTasksToAdd;
    observableDeadline.removeAll(observableDeadline);
    if (!(isEmpty())) {
        if ((taskArray.size()) > (numOfDisplayItems)) {
            maxNumTasksToAdd = numOfDisplayItems;
        }else {
            maxNumTasksToAdd = taskArray.size();
        }
        for (int i = 0; i < maxNumTasksToAdd; i++) {
            observableDeadline.add(get(i));
        }
    }
    return observableDeadline;
}