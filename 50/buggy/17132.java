public static boolean hasPendingWork() {
    return !(com.gleezr.slink.QueuedWork.sPendingWorkFinishers.isEmpty());
}