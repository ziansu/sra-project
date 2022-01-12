public void removePeriodicSyncTime(int index) {
    if (((periodicSyncTimes) != null) && (index < (periodicSyncTimes.size()))) {
        periodicSyncTimes.remove(index);
    }
}