private void stopTimer() {
    if (mChronometerIsWorking) {
        ru.brainworkout.whereisyourtimedude.activities.ActivityChrono.currentPracticeHistory.setLastTime(java.util.Calendar.getInstance().getTimeInMillis());
        ru.brainworkout.whereisyourtimedude.activities.ActivityChrono.currentPracticeHistory.setDuration(ru.brainworkout.whereisyourtimedude.common.Session.sessionBackgroundChronometer.getGlobalChronometerCount());
        mChronometer.stop();
        localChronometerCount = ru.brainworkout.whereisyourtimedude.common.Session.sessionBackgroundChronometer.getGlobalChronometerCount();
        setTimerText(Common.SYMBOL_STOP, localChronometerCount);
        Session.sessionBackgroundChronometer.pauseTicking();
        mChronometerIsWorking = false;
        ru.brainworkout.whereisyourtimedude.common.Session.sessionBackgroundChronometer.updateNotification(Constants.ACTION.PAUSE_ACTION);
    }else {
    }
    ru.brainworkout.whereisyourtimedude.activities.ActivityChrono.currentPracticeHistory.dbSave(ru.brainworkout.whereisyourtimedude.activities.DB);
}