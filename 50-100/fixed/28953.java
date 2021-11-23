public int compare(com.android.server.AlarmManagerService.Batch b1, com.android.server.AlarmManagerService.Batch b2) {
    long when1 = b1.start;
    long when2 = b2.start;
    if (when1 > when2) {
        return 1;
    }
    if (when1 < when2) {
        return -1;
    }
    return 0;
}