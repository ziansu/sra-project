@java.lang.SuppressWarnings(value = "unused")
static boolean hasPendingWork() {
    return !(com.gleezr.slink.QueuedWork.sPendingWorkFinishers.isEmpty());
}