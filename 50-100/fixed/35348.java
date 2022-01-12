private void clearQueue(java.util.Collection<? extends org.threadly.concurrent.PriorityScheduler.TaskWrapper> queue, java.util.List<java.lang.Runnable> resultList) {
    java.util.Iterator<? extends org.threadly.concurrent.PriorityScheduler.TaskWrapper> it = queue.iterator();
    while (it.hasNext()) {
        org.threadly.concurrent.PriorityScheduler.TaskWrapper tw = it.next();
        tw.cancel();
        if (!((tw.task) instanceof org.threadly.concurrent.PriorityScheduler.ShutdownRunnable)) {
            resultList.add(tw.task);
        }
    } 
    queue.clear();
}