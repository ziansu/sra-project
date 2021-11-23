@java.lang.SuppressWarnings(value = "unused")
static void waitToFinish() {
    java.lang.Runnable toFinish;
    while ((toFinish = com.gleezr.slink.QueuedWork.sPendingWorkFinishers.poll()) != null) {
        toFinish.run();
    } 
}