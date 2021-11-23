public long getPeriodicSyncTime(int index) {
    if (((periodicSyncTimes) != null) && (index < (periodicSyncTimes.size()))) {
        return periodicSyncTimes.get(index);
    }else {
        return 0;
    }
}