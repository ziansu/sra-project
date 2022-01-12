public java.util.ArrayList<org.magellan.faleiro.MagellanTaskRequest> getPendingTasks() {
    java.util.ArrayList<org.magellan.faleiro.MagellanTaskRequest> pt = new java.util.ArrayList<>();
    if ((numFreeTaskSlotsLeft.get()) <= 10) {
        int taken = pendingTasks.drainTo(pt, numFreeTaskSlotsLeft.get());
        numFreeTaskSlotsLeft.addAndGet((-taken));
    }
    return pt;
}