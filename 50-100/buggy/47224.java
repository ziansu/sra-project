private void scheduleReducer(java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>>> listSmallerHashmaps) throws java.io.IOException {
    boolean isCompleted = false;
    while (!isCompleted) {
        if (!(listSmallerHashmaps.isEmpty())) {
            allocateReduceTask(listSmallerHashmaps.remove(0));
        }else {
            isCompleted = checkForCompletion(job.getReducerSlaveID());
        }
    } 
}