private void updateTaskCounts(java.lang.Object id, java.util.List<java.lang.Integer> tasks) {
    synchronized(_tracked) {
        java.util.Map<java.lang.Integer, java.lang.Integer> taskEmittedTuples = _tracked.get(id).taskEmittedTuples;
        for (java.lang.Integer task : tasks) {
            int newCount = (backtype.storm.utils.Utils.get(taskEmittedTuples, task, 0)) + 1;
            taskEmittedTuples.put(task, newCount);
        }
    }
}