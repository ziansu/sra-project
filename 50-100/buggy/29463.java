@java.lang.Override
public void run() {
    mCalendar.setTimeInMillis(java.lang.System.currentTimeMillis());
    int seconds = me.dominicc.lhpwatch.TimeUtil.calcSecondsLeftInCurrentInterval(dayType, mCalendar);
    if (seconds <= 60) {
        shouldShowSeconds = true;
        secondsToPrint = seconds;
        invalidate();
    }else {
        shouldShowSeconds = false;
    }
    if (seconds <= 120)
        new android.os.Handler().postDelayed(this, 1000);
    else
        shouldShowSeconds = false;
    
}