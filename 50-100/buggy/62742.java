public void waitUntil(long x) {
    long wakeTime = (nachos.threads.Machine.timer().getTime()) + x;
    queue.add(new nachos.threads.Alarm.KThreadWithTime(nachos.threads.KThread.currentThread(), wakeTime));
    boolean intStatus = nachos.threads.Machine.interrupt().disable();
    nachos.threads.KThread.sleep();
    nachos.threads.Machine.interrupt().restore(intStatus);
}