public java.util.ArrayList<org.magellan.faleiro.MagellanTaskRequest> getPendingTasks() {
    java.util.ArrayList<org.magellan.faleiro.MagellanTaskRequest> pt = new java.util.ArrayList<>();
    if ((numFreeTaskSlotsLeft.get()) <= 10) {
        int value = numFreeTaskSlotsLeft.get();
        numFreeTaskSlotsLeft.set(0);
        int taken = pendingTasks.drainTo(pt, value);
        numFreeTaskSlotsLeft.addAndGet((value - taken));
    }
    return pt;
}