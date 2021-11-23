public int compare(nachos.threads.Alarm.Union u1, nachos.threads.Alarm.Union u2) {
    long wakeTime1 = u1.getWakeTime();
    long wakeTime2 = u2.getWakeTime();
    if (wakeTime1 > wakeTime2) {
        return 1;
    }else
        if (wakeTime1 < wakeTime2) {
            return -1;
        }else {
            return 0;
        }
    
}