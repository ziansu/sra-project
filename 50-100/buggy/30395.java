@java.lang.Override
public void run() {
    try {
        mpAlarmStand.stop();
        mpAlarmStand.prepare();
        long ringLength = mpAlarmStand.getDuration();
        android.util.Log.d(com.bitsorific.standup.service.CountDownService.TAG, ("length of stand up ringtone: " + ringLength));
        mpAlarmStand.start();
        timer = new java.util.Timer("cancel", true);
        com.bitsorific.standup.service.CountDownService.CancelAlarm cancelAlarm = new com.bitsorific.standup.service.CountDownService.CancelAlarm();
        timer.schedule(cancelAlarm, (ringLength - 800));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}