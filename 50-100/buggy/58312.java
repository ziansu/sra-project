public javafx.collections.ObservableList<com.nexus.simplify.database.GenericTask> getObservable() {
    int maxNumTasksToAdd;
    if (isEmpty()) {
        if ((taskArray.size()) > (numOfDisplayItems)) {
            maxNumTasksToAdd = numOfDisplayItems;
        }else {
            maxNumTasksToAdd = taskArray.size();
        }
        for (int i = 0; i < maxNumTasksToAdd; i++) {
            observableGeneric.add(get(i));
        }
    }
    return observableGeneric;
}