@java.lang.Override
public void onClick(android.view.View v) {
    hk.hku.cs.curvewrecker.ChangeSleepTimeDialog m = new hk.hku.cs.curvewrecker.ChangeSleepTimeDialog(this);
    m.setDate(myHour, myMin);
    m.show();
    m.setTimeListener(new hk.hku.cs.curvewrecker.ChangeSleepTimeDialog.OnTimeListener() {
        @java.lang.Override
        public void onClick(java.lang.String hour, java.lang.String minute) {
            myHour = java.lang.Integer.parseInt(hour);
            myMin = java.lang.Integer.parseInt(minute);
            sleeptime_set.setText((((hour + " hour ") + minute) + " min"));
        }
    });
}