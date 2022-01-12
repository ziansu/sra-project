@java.lang.Override
public int compare(DataModel.MyTask firstTask, DataModel.MyTask secondTask) {
    if ((firstTask.getPriority()) > (secondTask.getPriority())) {
        return 1;
    }
    if ((firstTask.getPriority()) == (secondTask.getPriority())) {
        return 0;
    }
    return -1;
}