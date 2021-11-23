public void inactiveTimerStart() {
    java.lang.String sDelay = settings.getString("inactiveTimerMins", com.givenhansco.keystonenavigation.Activities.MainMenuActivity.DEFAULT_TIMER_DELAY);
    long delay;
    try {
        delay = java.lang.Long.parseLong(sDelay);
    } catch (java.lang.Exception e) {
        delay = 240;
    }
    if (delay != 0) {
        delay = (1000 * 60) * delay;
        startInactiveTimer(delay);
    }else {
    }
}