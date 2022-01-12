public void checkIntent() {
    android.os.Bundle data = getIntent().getExtras();
    if (data != null) {
        ph.edu.mobapde.meditake.meditake.beans.Schedule schedule = data.getParcelable(Schedule.TABLE);
        if ((data.get(getString(R.string.schedule_snooze))) == null) {
            setNextDrinking(schedule);
        }else {
            int snoozeTime = data.getInt(getString(R.string.schedule_snooze));
            if (snoozeTime == 0) {
                setNextDrinking(schedule);
            }else {
                setSnooze(schedule, snoozeTime);
            }
        }
    }
}